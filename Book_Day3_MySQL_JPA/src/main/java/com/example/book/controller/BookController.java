package com.example.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.BookService;
import java.util.*; 


@RestController
@RequestMapping("/api/LibraryBooks/v1")
public class BookController {

	@Autowired
	private BookService service; 
	
	
	//working
	@PostMapping("/add")
	public Book addBook(@RequestBody Book b) {
		return service.addBook(b);
	}	
	//working
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		service.deleteBook(id);
	}
	
	//working
	@GetMapping("/all") 
	public List<Book> getAll(){
		return service.getAllBooks();
	}
	
	
	//working
	@GetMapping("/find/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
		return service.getBookById(id); 
	}
	
	//working
	@GetMapping("/title/{title}")
	public List<Book> getBookByTitle(@PathVariable String title){
		return service.getBookByTitle(title); 
	}
	
	
	@GetMapping("/author/{author}")
	public List<Book> getBookByAuthor(@PathVariable String author){
		return service.getBookByAuthor(author);  
	}
	
	//working
	@GetMapping("/count")
	public long getTotalBooks() {
		return service.getTotalBooks(); 
	}
	
	
}
