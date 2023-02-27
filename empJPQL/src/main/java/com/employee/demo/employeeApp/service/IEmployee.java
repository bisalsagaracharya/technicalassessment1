package com.employee.demo.employeeApp.service;

import com.employee.demo.employeeApp.dto.EmployeeDTO;
import com.employee.demo.employeeApp.exception.EmployeeNotFoundException;

import java.util.List;

public interface IEmployee {
    EmployeeDTO addEmployee(EmployeeDTO empRequest);
    EmployeeDTO updateEmp(int empId, EmployeeDTO emp) throws EmployeeNotFoundException;
    void deleteById(int empId) throws EmployeeNotFoundException;
    List<EmployeeDTO> getAllEmployee();
}
