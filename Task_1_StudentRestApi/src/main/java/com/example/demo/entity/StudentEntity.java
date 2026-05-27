package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
import jakarta.persistence.*;

@Entity
@Table(name = "students_table")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotBlank(message = "Name cannot be blank")
	private String name; 
	
	@Email
	private String email; 
	
	@NotBlank(message = "Branch Cannot be blank")
	private String branch; 
	private double cgpa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public StudentEntity(Long id, @NotBlank(message = "Name cannot be blank") String name, @Email String email,
			@NotBlank(message = "Branch Cannot be blank") String branch, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + ", cgpa="
				+ cgpa + "]";
	} 
	
	
	
}
