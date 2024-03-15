package com.example.demo.controller;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class EmployeeController {

    final private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
}
