package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;


    // CRUD Operations
    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(int id, Book book) {

        Optional<Book> optionalBook = 
                bookRepository.findById(id);

        if(optionalBook.isPresent()) {

            Book existingBook = optionalBook.get();

            existingBook.setName(book.getName());
            existingBook.setAuthorName(book.getAuthorName());
            existingBook.setPrice(book.getPrice());

            return bookRepository.save(existingBook);
        }

        return null;
    }

    @Override
    public void deleteBook(int id) {
    		Optional<Book> book = bookRepository.findById(id);

        if(book.isPresent()) {
            bookRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }


    // Search Operations
    @Override
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByName(title);
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthorName(author);
    }


    // Sorting
    @Override
    public List<Book> sortBooksByTitle() {

        List<Book> books = bookRepository.findAll();

        books.sort(
            Comparator.comparing(Book::getName)
        );

        return books;
    }

    @Override
    public List<Book> sortBooksByAuthor() {

        List<Book> books = bookRepository.findAll();

        books.sort(
            Comparator.comparing(Book::getAuthorName)
        );

        return books;
    }

    @Override
    public List<Book> sortBooksByPrice() {
    	// TODO Auto-generated method stub
    	List<Book> books = bookRepository.findAll();
    	
    	books.sort(
    			Comparator.comparing(Book::getPrice)
    			);
    	
    	return books;
    }
    
    public long getTotalBooks(){
    		long count = 0; 
    		count = bookRepository.count(); 
    		return count; 
    	}

}