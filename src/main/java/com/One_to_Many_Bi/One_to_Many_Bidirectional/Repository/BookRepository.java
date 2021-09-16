package com.One_to_Many_Bi.One_to_Many_Bidirectional.Repository;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
