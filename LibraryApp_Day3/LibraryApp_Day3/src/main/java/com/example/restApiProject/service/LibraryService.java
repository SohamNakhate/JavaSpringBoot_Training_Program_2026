package com.example.restApiProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restApiProject.model.Library;
import com.example.restApiProject.repository.LibraryRepository;

import java.util.*;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepository repository;
	
	public Library saveLibrary(Library l) {
		return repository.save(l); 
	}
	
	public List<Library> getLibrary(){
		return repository.getLibrary(); 
	}
	
	public Library getLibraryById(int id) {
        return repository.findById(id);
    }

	public String deleteLibrary(int id) {
		repository.delete(id);
		return "product removed !! " + id;
	}

//    public Library updateLibrary(Library product) {
//       return repository.update(product);
//    }
    
}
