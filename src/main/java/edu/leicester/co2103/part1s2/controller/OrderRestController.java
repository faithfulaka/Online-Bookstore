package edu.leicester.co2103.part1s2.controller;

import edu.leicester.co2103.part1s2.domain.Book;
import edu.leicester.co2103.part1s2.domain.OrderUnit;
import edu.leicester.co2103.part1s2.repo.AuthorRepository;
import edu.leicester.co2103.part1s2.repo.BookRepository;
import edu.leicester.co2103.part1s2.repo.ErrorInfo;
import edu.leicester.co2103.part1s2.repo.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class OrderRestController {
    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    private final OrderRepository orderRepo;

    public OrderRestController(BookRepository bookRepo, AuthorRepository authorRepo, OrderRepository orderRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        this.orderRepo = orderRepo;
    }
    //The list of all orders
    @GetMapping("/orders")
    private ResponseEntity<?> endpoint14(){
        List<OrderUnit> orderUnit = orderRepo.findAll();
        if (!orderUnit.isEmpty()) {
            return new ResponseEntity<>(orderUnit, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("No orders found"),HttpStatus.NOT_FOUND);
    }

    //To Make a Certain Order
    @PostMapping("/orders")
    public ResponseEntity<?> endpoint15(@RequestBody OrderUnit orderUnit) {
        if (orderRepo.existsById(orderUnit.getId())) {
            return new ResponseEntity<>(new ErrorInfo("Order " + orderUnit.getId() + " already made"), HttpStatus.CONFLICT);
        }
        orderRepo.save(orderUnit);
        return new ResponseEntity<>(orderUnit, HttpStatus.OK);
    }

    //To Retrieve A Specific Order
    @GetMapping("/orders/{id}")
    public ResponseEntity<?> endpoint16(@PathVariable("id") Long id) {
        Optional<OrderUnit> order = orderRepo.findById(id);
        if (order.isPresent()) {
            return new ResponseEntity<>(order.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Order not found"), HttpStatus.NOT_FOUND);
    }

    //To Update A Specific Order
    @PutMapping("/orders/{id}")
    public ResponseEntity<?>endpoint17(@PathVariable("id") Long id, @RequestBody OrderUnit updateOrderUnit) {
        if (orderRepo.existsById(id)) {
            updateOrderUnit.setId(id);
            orderRepo.save(updateOrderUnit);
            return new ResponseEntity<>(updateOrderUnit, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Order not updated"), HttpStatus.NOT_FOUND);
    }

    //To List all Books in An Order
    @GetMapping("/orders/{id}/books")
    public ResponseEntity<?> endpoint18(@PathVariable("id") Long id) {
        Optional<OrderUnit> order = orderRepo.findById(id);
        if (order.isPresent()) {
            return new ResponseEntity<>(order.get().getBooks(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("No books found in the order"), HttpStatus.NOT_FOUND);
    }
    //Add A Book To A Current Order
    @PostMapping("/orders/{id}/books")
    public ResponseEntity<?> endpoint19(@PathVariable("id") Long id, @RequestBody Book book) {
        Optional<OrderUnit> order = orderRepo.findById(id);
        if (order.isPresent()) {
            order.get().getBooks().add(book);
            orderRepo.save(order.get());
            return new ResponseEntity<>(new ErrorInfo("Books added to the order"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("No book found in this order"), HttpStatus.NOT_FOUND);
    }

    //To Remove A Book From An Current Order
    @DeleteMapping("/order/{id}/books/{ISBN}")
    public ResponseEntity<?> endpoint20(@PathVariable("id") Long id, @PathVariable("ISBN") String ISBN) {
        Optional<OrderUnit> order = orderRepo.findById(id);
        if (order.isPresent()) {
            List<Book> books = order.get().getBooks();
            books.removeIf(book -> book.getISBN().equals(ISBN));
            orderRepo.save(order.get());
            return new ResponseEntity<>(new ErrorInfo("Book removed from this order"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("No books was removed from this order"), HttpStatus.NOT_FOUND);
    }
}
