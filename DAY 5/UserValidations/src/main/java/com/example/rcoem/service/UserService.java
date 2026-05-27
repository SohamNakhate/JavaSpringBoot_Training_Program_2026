package com.example.rcoem.service;

import java.util.*;

import com.example.rcoem.model.UserModel; 

public interface UserService {
	
	
	public List<UserModel> getAllUsers(); 
	
	public UserModel addUser(UserModel user);
	
	public String removeUser(Integer id); 
	
	
}
