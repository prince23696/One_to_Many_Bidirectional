package com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int b_id;
    private String name;
    private int price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    @JsonManagedReference
    private List<Author> author;

    public Book() {
    }

    public Book(int b_id) {
        this.b_id = b_id;
    }

    public Book(int b_id, String name, int price, List<Author> author) {
        this.b_id = b_id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
