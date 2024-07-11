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
public class BookRestController {
    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;

    private final OrderRepository orderRepo;

    public BookRestController(BookRepository bookRepo, AuthorRepository authorRepo, OrderRepository orderRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        this.orderRepo = orderRepo;

    }

    //The list of All Books
    @GetMapping("/books")
    public ResponseEntity<?> endpoint7() {
        List<Book> result = bookRepo.findAll();
        if (result.isEmpty()) {
            return new ResponseEntity<>(new ErrorInfo("No books Found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //To Create A Specific Book
    @PostMapping("/books")
    public ResponseEntity<?> endpoint8(@RequestBody Book book) {
        if (bookRepo.existsById(book.getISBN())) {
            return new ResponseEntity<>(new ErrorInfo("Book with ISBN: " + book.getISBN() + " already exists"), HttpStatus.CONFLICT);
        }
        bookRepo.save(book);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    //To Retrieve A Specific Book
    @GetMapping("/books/{ISBN}")
    public ResponseEntity<?> endpoint9(@PathVariable("ISBN") String ISBN) {
        if (bookRepo.findById(ISBN).isPresent()) {
            return new ResponseEntity<>(bookRepo.findById(ISBN).get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Book not found"), HttpStatus.NOT_FOUND);
    }

    //To Update A Specific Book
    @PutMapping("/books/{ISBN}")
    public ResponseEntity<?> endpoint10(@PathVariable("ISBN") String ISBN, @RequestBody Book newBook) {
        if (bookRepo.existsById(ISBN)) {
            return new ResponseEntity<>(newBook, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Book not updated"), HttpStatus.NOT_FOUND);
    }

    //To Delete A Specific Book
    @DeleteMapping("/books/{ISBN}")
    public ResponseEntity<?> endpoint11(@PathVariable("ISBN") String ISBN) {
        if (bookRepo.existsById(ISBN)) {
            bookRepo.deleteById(ISBN);
            return new ResponseEntity<>(new ErrorInfo("Book deleted"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Book not deleted"), HttpStatus.NOT_FOUND);
    }



    //To List All Authors Of A Book
    @GetMapping("books/{ISBN}/authors")
    public ResponseEntity<?> endpoint12(@PathVariable("ISBN") String ISBN) {
        Optional<Book> book = bookRepo.findById(ISBN);
        if (book.isPresent()) {
            return new ResponseEntity<>(book.get().getAuthor(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("No Authors of the Book are listed"), HttpStatus.NOT_FOUND);
    }

    //To List All Orders Containing A Specific Book (endpoint #13)
    @GetMapping("books/{ISBN}/orders")
    public ResponseEntity<?> endpoint13(@PathVariable("ISBN") String ISBN) {
        List<OrderUnit> orderItemEntities = orderRepo.findByBooks_ISBN(ISBN);
        if (!orderItemEntities.isEmpty()) {
            return new ResponseEntity<>(orderItemEntities, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("There are no orders of this book"), HttpStatus.NOT_FOUND);
    }
}

