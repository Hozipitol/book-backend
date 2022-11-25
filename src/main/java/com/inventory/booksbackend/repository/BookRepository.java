package com.inventory.booksbackend.repository;


import com.inventory.booksbackend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{

}
