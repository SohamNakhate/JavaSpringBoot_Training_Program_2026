package com.example.restApiProject.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.restApiProject.model.Library;

@Repository
public class LibraryRepository {
private List<Library> list = new ArrayList<Library>(); 
	
	public LibraryRepository() {
		createLibrary(); 
	}
	
	public void createLibrary() {

		list = List.of(
				new Library(101, "The Monk Mode"), 
				new Library(102, "The 5AM Club")				
				);
	}
	
	public List<Library> getLibrary(){
		return list; 
	}
	
	public Library findById(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (id)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public List<Library> search(String name) {
		return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
	}
	
	public Library save(Library l) {
		Library library = new Library(); 
		library.setId(l.getId());
		library.setName(l.getName());

		list.add(library);
		return library;
	}
	
	public String delete(Integer id) {
		list.removeIf(x -> x.getId() == (id));
		return null;
	}
	
	
	
	
}
