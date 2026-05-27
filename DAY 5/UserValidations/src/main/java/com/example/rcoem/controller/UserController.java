package com.example.rcoem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.rcoem.model.UserModel;
import com.example.rcoem.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	public UserService userService; 
	
	@GetMapping("/all") 
	public List<UserModel> getAllUsers(){
		return userService.getAllUsers(); 
	}
	
	@PostMapping("/add")
	public UserModel addUser( @Valid @RequestBody UserModel user) {
		return userService.addUser(user); 
	}

}
