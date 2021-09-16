package com.One_to_Many_Bi.One_to_Many_Bidirectional.Repository;

import com.One_to_Many_Bi.One_to_Many_Bidirectional.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
