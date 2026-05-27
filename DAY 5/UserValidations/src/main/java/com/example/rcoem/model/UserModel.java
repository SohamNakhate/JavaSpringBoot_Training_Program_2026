package com.example.rcoem.model;

import java.util.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.*;


@Entity
@Table(name = "User_table")
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@NotBlank(message = "Name Field cannot be blank")
	private String name; 
	
	@NotBlank(message="Username required")
	@Column(unique = true)
	private String username;

	@NotBlank(message="Password required")
	private String password;
	
	
	@Pattern(regexp= "^[0-9]{10}", message ="Phone number must contain exactly 10 digits")
	private String phoneNumber ; 
	
	@Email(message = "Please enter a valid email")
	private String email; 
	
	@Past
	private LocalDate dateOfBirth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	
	
}


