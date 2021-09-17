package com.One_to_Many_Bi.One_to_Many_Bidirectional.Service;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Book;
import com.One_to_Many_Bi.One_to_Many_Bidirectional.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book getBook(int id) {
        return bookRepository.findById(id).get();

    }

    @Override
    public String addBook(Book book) {
        bookRepository.save(book);
        return "Book Added Successfully";
    }

    @Override
    public Book updateBook(int id, Book book) {
        Book book1 = bookRepository.findById(id).get();
        book1.setName(book.getName());
        book1.setPrice(book.getPrice());
        book1.setAuthor(book.getAuthor());
        bookRepository.save(book1);
        return book1;
    }

    @Override
    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
