package com.example.restApiProject.model;

public class Library {
	private int id; 
	private String name;
	
	public Library(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Library() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	} 
	
	
	
	
}
