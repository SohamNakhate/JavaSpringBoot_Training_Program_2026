package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	public StudentService studentService; 
	
	@PostMapping("/add")
	public StudentEntity addStudent( @Valid @RequestBody StudentEntity student) {
		return studentService.addStudent(student); 
	}
	
	@GetMapping("/getStudents")
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudent(); 
	}
	
	@GetMapping("/getStudents/{id}")
	public Optional<StudentEntity> getStudentById(Long id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(Long id) {
		return studentService.deleteStudentById(id);
	}
	
}
