package com.example.demo.service;
import java.util.*;

import com.example.demo.entity.StudentEntity; 

public interface StudentService {
	
//	POST
	public StudentEntity addStudent(StudentEntity student); 
	
//	GET
	public List<StudentEntity> getAllStudent(); 
	public Optional<StudentEntity> getStudentById(Long id); 
	
//	DELETE
	public String deleteStudentById(Long id); 
	
}
