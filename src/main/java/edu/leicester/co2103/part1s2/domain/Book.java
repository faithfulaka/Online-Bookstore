package edu.leicester.co2103.part1s2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    private String ISBN;
    private String title;
    private int publicationYear;
    private double price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author author;

    @ManyToMany(mappedBy = "books")
    private List<OrderUnit> orderItems = new ArrayList<>();


    public String getISBN() { return ISBN; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getPublicationYear() { return publicationYear; }

    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public Author getAuthor() {return author;}

    public void setAuthor(Author author) {this.author = author;}

    public List<OrderUnit> getOrders() { return orderItems; }

    public void setOrders(List<OrderUnit> orderItems) {this.orderItems = orderItems;}
}
