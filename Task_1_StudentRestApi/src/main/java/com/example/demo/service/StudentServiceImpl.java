package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository repo;

	public StudentServiceImpl(StudentRepository repo) {
		this.repo = repo;
	}

	@Override
	public StudentEntity addStudent(StudentEntity student) {
		return repo.save(student);
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Optional<StudentEntity> getStudentById(Long id) {
		Optional<StudentEntity> student = repo.findById(id);
		if (student.isEmpty()) {
			throw new StudentNotFoundException("Student not found with id: " + id);
		}
		return student;
	}

	@Override
	public String deleteStudentById(Long id) {
		if (!repo.existsById(id)) {
			throw new StudentNotFoundException("Student not found with id: " + id);
		}
		repo.deleteById(id);
		return "Deleted student successfully!";
	}
}