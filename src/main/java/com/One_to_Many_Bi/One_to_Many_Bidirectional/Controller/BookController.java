package com.One_to_Many_Bi.One_to_Many_Bidirectional.Controller;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Book;
import com.One_to_Many_Bi.One_to_Many_Bidirectional.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("getBook/{id}")
    public Book getBook(@PathVariable int id) {
        Book book = bookService.getBook(id);
        return book;
    }

    @GetMapping("/getBooks")
    public List<Book> getAll() {
        return (List<Book>) bookService.getAll();
    }

    @PostMapping("/save")
    public Book addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return book;
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "item deleted form database id=" + id;
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return book;
    }
}