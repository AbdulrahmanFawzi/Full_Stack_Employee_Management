package com.example.employeemanagementfrontend.controller;
import com.example.employeemanagementfrontend.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class EmployeeController {
    private final String apiEndpoint = "http://localhost:8080/employees";
    
    @GetMapping("/")
    public String home() {
        return "redirect:/employees";
    }
    
    @GetMapping("/employees")
    public String listEmployees(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Employee[] employees = restTemplate.getForObject(apiEndpoint, Employee[].class);
        model.addAttribute("employees", employees);
        return "employees";
    }
    
    @GetMapping("/add-employee")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }
    
    @PostMapping("/add-employee")
    public String addEmployee(Employee employee) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(apiEndpoint, employee, Employee.class);
        return "redirect:/employees";
    }
}