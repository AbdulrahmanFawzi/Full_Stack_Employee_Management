package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:8088") // Allow front-end access
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository repository;
    
    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
