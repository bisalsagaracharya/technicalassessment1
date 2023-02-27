package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.DepartmentCustomeException;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addNewDepartment(Department department) throws DepartmentCustomeException {
        return this.departmentRepository.save(department);

    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = this.departmentRepository.findAll();
        return departments;
    }

    @Override
    public Department DeleteDepartmentById(Long departmentId) throws DepartmentCustomeException {
        Optional<Department> findById = this.departmentRepository.findById(departmentId);
        if (findById.isPresent()) {
            this.departmentRepository.deleteById(departmentId);
        } else {
            throw new DepartmentCustomeException("Department not Found");
        }
        return findById.get();
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) throws DepartmentCustomeException {
        Optional<Department> optionalDepartment = this.departmentRepository.findById(department.getDepartmentId());
        if (optionalDepartment.isEmpty()) {
            throw new DepartmentCustomeException("department not found");
        } else {
            this.departmentRepository.save(department);
            return department;
        }
    }
}