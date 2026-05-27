package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository repo; 

	@Override
	public StudentEntity addStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		return repo.save(student); 
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		return repo.findAll(); 
	}

	@Override
	public Optional<StudentEntity> getStudentById(Long id) {
		return repo.findById(id);  
	}

	@Override
	public String deleteStudentById(Long id) {
		repo.deleteById(id);
		return "Deleted student successfully!"; 
	}

}
