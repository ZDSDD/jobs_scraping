package com.example.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.example.demo.Entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeRepository {
    final private DynamoDBMapper dynamoDBMapper;

    public String createEmployee(Employee employee) {
        dynamoDBMapper.save(employee);
        return employee.getLoginAlias();
    }

    public Employee getEmployeeById(String id) {
        return dynamoDBMapper.load(Employee.class, id);
    }

    public List<Employee> getEmployees() {
        return dynamoDBMapper.scan(Employee.class, new DynamoDBScanExpression());
    }
}
