package com.example.rcoem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rcoem.exception.ResourceNotFoundException;
import com.example.rcoem.model.MovieModel;
import com.example.rcoem.repository.MovieRepository;
import java.util.*; 

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class MovieController {
	
	@Autowired
	private MovieRepository repository; 

	@GetMapping("/all")
	public List<MovieModel> getAll(){
		return repository.findAll(); 
	}
	
	@PostMapping("/movies")
	public MovieModel create(@RequestBody MovieModel obj) {
		return repository.save(obj); 
	}
	
	@GetMapping("/movies/{id}")
	public ResponseEntity<MovieModel> getById(@PathVariable Long id) {
	MovieModel obj = repository.findById(id)
			.orElseThrow(() ->
			new ResourceNotFoundException(
					"Movie not found"
					));

	return ResponseEntity.ok(obj);
	}
	
	@PutMapping("/movies/{id}")
	public ResponseEntity<MovieModel> update(@PathVariable Long id,	@RequestBody MovieModel details) {
	MovieModel obj = repository.findById(id)
			.orElseThrow(() ->
			new ResourceNotFoundException(
					"Movie not found"
					));

	obj.setMovieName(details.getMovieName());
	obj.setDirectorName(details.getDirectorName());
	obj.setRating(details.getRating());
	
	return ResponseEntity.ok(repository.save(obj));
	}
	
	
	
	@DeleteMapping("/movies/{id}")
	public Map<String, Boolean> delete(@PathVariable Long id){
		MovieModel obj = repository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException(
						"Movie Not Found")); 
		
		repository.delete(obj); 
		Map<String, Boolean> response =new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
