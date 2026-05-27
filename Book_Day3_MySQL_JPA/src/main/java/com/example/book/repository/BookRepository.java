package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.model.Book;
import java.util.*; 

public interface BookRepository extends JpaRepository<Book, Integer>{
	List<Book> findByName(String name);

    List<Book> findByAuthorName(String authorName);
}
