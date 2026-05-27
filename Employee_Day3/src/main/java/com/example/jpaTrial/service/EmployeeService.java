package com.example.jpaTrial.service;

import com.example.jpaTrial.model.Employee;
import java.util.*; 

public interface EmployeeService {

    Employee save(Employee obj);

    List<Employee> getAll();

    Employee getById(int id);

    Employee update(Employee obj);

    String delete(int id);
}