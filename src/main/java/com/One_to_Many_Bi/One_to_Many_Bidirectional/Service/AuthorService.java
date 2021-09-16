package com.One_to_Many_Bi.One_to_Many_Bidirectional.Service;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Author;

import java.util.List;

public interface AuthorService {

    public List<Author> getAllAuthor();

    public Author getAuthor(int id);

    public String addAuthor(Author author);

    public Author updateAuthor(int id, Author author);

    public String deleteAuthor(int id);

}
