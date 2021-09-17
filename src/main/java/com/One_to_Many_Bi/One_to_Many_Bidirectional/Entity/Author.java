package com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a_id;
    private String fname;
    private String lname;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Book book;

    public Author() {
    }

    public Author(int a_id) {
        this.a_id = a_id;
    }

    public Author(int a_id, String fname, String lname, Book book) {
        this.a_id = a_id;
        this.fname = fname;
        this.lname = lname;
        this.book = book;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "a_id=" + a_id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", book=" + book +
                '}';
    }
}

