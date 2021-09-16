package com.One_to_Many_Bi.One_to_Many_Bidirectional.Service;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Author;
import com.One_to_Many_Bi.One_to_Many_Bidirectional.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthor() {
        return (List<Author>) authorRepository.findAll();
    }

    @Override
    public Author getAuthor(int id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author Added Successfully";
    }

    @Override
    public Author updateAuthor(int id, Author author) {
        Author author1 = authorRepository.findById(id).get();
        author1.setFname(author.getFname());
        author1.setLname(author.getLname());
        author1.setBook(author.getBook());
        return author1;
    }

    @Override
    public String deleteAuthor(int id) {
        authorRepository.deleteById(id);
        return "Author Deleted from database id=" + id;
    }
}
