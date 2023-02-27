package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.DepartmentCustomeException;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;
import com.example.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department AddDepartment(@RequestBody Department department) throws DepartmentCustomeException {
        return this.departmentService.addNewDepartment(department);
    }

    @GetMapping("/getAllDepartments")
    public List<Department> getAllDepartment() {
        List<Department> departments = this.departmentService.getAllDepartment();
        return departments;
    }

    @DeleteMapping("/delete/{departmentId}")
    public Department deleteDepartment(@PathVariable ("departmentId") Long departmentId) throws DepartmentCustomeException {
        Department department=this.departmentService.DeleteDepartmentById(departmentId);
        return department;
    }

    @PutMapping("/updateDepartment{departmentId}")
    public Department updateDepartment(@PathVariable ("departmentId")Long departmentId,@RequestBody Department department) throws DepartmentCustomeException {
        return this.departmentService.updateDepartment(departmentId,department);

    }
}