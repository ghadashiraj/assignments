package edu.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.demo.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}