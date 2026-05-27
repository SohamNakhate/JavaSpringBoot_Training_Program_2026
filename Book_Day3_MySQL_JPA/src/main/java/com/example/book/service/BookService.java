package com.example.book.service;

import com.example.book.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    // CRUD Operations
    Book addBook(Book book);

    Book updateBook(int id, Book book);

    void deleteBook(int id);

    List<Book> getAllBooks();

    Optional<Book> getBookById(int id);


    // Search Operations
    List<Book> getBookByTitle(String title);

    List<Book> getBookByAuthor(String author);


    // Sorting
    List<Book> sortBooksByTitle();

    List<Book> sortBooksByAuthor();

    List<Book> sortBooksByPrice();


    // Statistics
    long getTotalBooks();
}