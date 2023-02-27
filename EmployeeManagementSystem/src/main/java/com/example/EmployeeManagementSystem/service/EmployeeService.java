package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;

import java.util.List;

public interface EmployeeService {

    Employee addNewEmployee(Employee employee) throws EmployeeCustomeException;
    List<Employee> getAllEmployees();

    Employee DeleteEmployeeById(Long employeeId) throws EmployeeCustomeException;

    Employee updateEmployee( Long employeeId,Employee employee) throws EmployeeCustomeException;

}
