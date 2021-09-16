package com.One_to_Many_Bi.One_to_Many_Bidirectional.Service;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAll();

    public Book getBook(int id);

    public String addBook(Book book);

    public Book updateBook(int id, Book book);

    public String deleteBook(int id);

}
