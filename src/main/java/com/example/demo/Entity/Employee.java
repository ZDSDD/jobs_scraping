package com.example.demo.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Employee")
public class Employee {
    @DynamoDBHashKey(attributeName = "LoginAlias")
    @DynamoDBAutoGeneratedKey
    private String loginAlias;

    @DynamoDBAttribute(attributeName = "FirstName")
    private String firstName;

    @DynamoDBAttribute(attributeName = "LastName")
    private String lastName;

    @DynamoDBAttribute(attributeName = "ManagerLoginAlias")
    private String managerLoginAlias;

    @DynamoDBAttribute(attributeName = "Designation")
    private String designation;

    @DynamoDBAttribute(attributeName = "Skills")
    private Set<String> skills;
}