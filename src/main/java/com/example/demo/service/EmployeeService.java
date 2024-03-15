package com.example.demo.service;


import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    final private EmployeeRepository employeeRepository;

    public String createEmployee(Employee employee){
        return employeeRepository.createEmployee(employee);
    }
    public List<Employee> getEmployees(){
        return employeeRepository.getEmployees();
    }
}
