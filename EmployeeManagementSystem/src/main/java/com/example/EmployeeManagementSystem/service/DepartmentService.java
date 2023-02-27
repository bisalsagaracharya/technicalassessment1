package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.DepartmentCustomeException;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;

import java.util.List;

public interface DepartmentService {

    Department addNewDepartment(Department department) throws DepartmentCustomeException;
    List<Department> getAllDepartment();

    Department DeleteDepartmentById(Long  departmentId) throws DepartmentCustomeException;

    Department updateDepartment( Long departmentId,Department department) throws DepartmentCustomeException;
}
