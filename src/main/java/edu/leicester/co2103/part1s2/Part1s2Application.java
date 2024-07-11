package edu.leicester.co2103.part1s2;

import edu.leicester.co2103.part1s2.domain.Author;
import edu.leicester.co2103.part1s2.domain.Book;
import edu.leicester.co2103.part1s2.domain.OrderUnit;
import edu.leicester.co2103.part1s2.repo.AuthorRepository;
import edu.leicester.co2103.part1s2.repo.BookRepository;
import edu.leicester.co2103.part1s2.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class Part1s2Application implements CommandLineRunner {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private OrderRepository orderRepository;



    public static void main(String[] args) {
        SpringApplication.run(Part1s2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setName("Faithful Olawolu");
        author.setBirthyear(2002);
        author.setNationality("Nigerian");
        authorRepository.save(author);


        Book book = new Book();
        book.setISBN("4536723695310");
        book.setTitle("One Piece: Gold Rush");
        book.setPublicationYear (2024);
        book.setPrice (29.99);
        book.setAuthor (author);
        bookRepository.save(book);


        OrderUnit order=new OrderUnit();
        order.setDatetime(new Timestamp(System.currentTimeMillis()));
        order.setCustomerName("Chris Evans");
        order.getBooks().add(book);
        orderRepository.save(order);

      }

    }
