package com.example.jpaTrial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*; 

import com.example.jpaTrial.model.Employee;
import com.example.jpaTrial.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	    @Autowired
	    private EmployeeRepository repository;

	    @Override
	    public Employee save(Employee obj) {
	        return repository.save(obj);
	    }

	    @Override
	    public List<Employee> getAll() {
	        return repository.findAll();
	    }

	    @Override
	    public Employee getById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    @Override
	    public Employee update(Employee obj) {
	        return repository.save(obj);
	    }

	    @Override
	    public String delete(int id) {
	        repository.deleteById(id);
	        return "Deleted Successfully";
	    }
}
