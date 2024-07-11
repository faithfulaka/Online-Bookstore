package edu.leicester.co2103.part1s2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp datetime;
    private String customerName;

    @ManyToMany
    @JoinTable(name = "Order_Book",joinColumns = @JoinColumn(name = "Order_id"),inverseJoinColumns = @JoinColumn(name = "Book_id"))
    @JsonBackReference
    private List<Book> books = new ArrayList<>();

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public List<Book> getBooks() {return books;}

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
