package com.One_to_Many_Bi.One_to_Many_Bidirectional.Controller;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Author;
import com.One_to_Many_Bi.One_to_Many_Bidirectional.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("getAuthor/{id}")
    public Author getAuthor(@PathVariable int id) {
        Author author = authorService.getAuthor(id);
        return author;
    }

    @GetMapping("/getAuthors")
    public List<Author> getAllAuthor() {
        return (List<Author>) authorService.getAllAuthor();
    }

    @PostMapping("/saveAuthor")
    public Author addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
        return author;
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable int id) {
        authorService.deleteAuthor(id);
        return "item deleted form database id=" + id;
    }

    @PutMapping("/updateAuthor/{id}")
    public Author updateAuthor(@PathVariable int id, @RequestBody Author author) {
        authorService.updateAuthor(id, author);
        return author;
    }
}
