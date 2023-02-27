package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;
import com.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
     private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee AddEmployee(@RequestBody Employee employee) throws EmployeeCustomeException {
        return this.employeeService.addNewEmployee(employee);

    }
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        List<Employee> emp=this.employeeService.getAllEmployees();
        return emp;
    }

    @DeleteMapping("/delete/{employeeId}")
    public Employee deleteEmployee(@PathVariable ("employeeId") Long employeeId) throws EmployeeCustomeException {
        Employee emp=this.employeeService.DeleteEmployeeById(employeeId);
        return emp;
    }

    @PutMapping("/updateEmployee{employeeId}")
    public Employee updateEmployee(@PathVariable ("employeeId")Long employeeId,@RequestBody Employee employee) throws EmployeeCustomeException {
        return this.employeeService.updateEmployee(employeeId,employee);

    }
}
