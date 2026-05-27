package com.example.jpaTrial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaTrial.model.Employee;
import com.example.jpaTrial.service.EmployeeService;
import java.util.*; 


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee obj) {
        return service.save(obj);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/find/{id}")
    public Employee getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee obj) {
        return service.update(obj);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}




