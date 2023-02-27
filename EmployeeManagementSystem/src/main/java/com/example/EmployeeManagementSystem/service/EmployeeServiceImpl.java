package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.exception.EmployeeCustomeException;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addNewEmployee(Employee employee) throws EmployeeCustomeException {

        Employee employeeFound = employeeRepository.findEmployeeByEmployeeId(employee.getEmployeeId());
        if (employeeFound != null) {
            throw new EmployeeCustomeException("There is a employee already present with this employeeId");
        }
        return employeeRepository.save(employee);
    }


    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee DeleteEmployeeById(Long employeeId) throws EmployeeCustomeException {
        Optional<Employee> findById = this.employeeRepository.findById(employeeId);
        if (findById.isPresent()) {
            this.employeeRepository.deleteById(employeeId);
        } else {
            throw new EmployeeCustomeException("Employee not Found");
        }
        return findById.get();

    }
    @Override
    public Employee updateEmployee(Long employeeId,Employee employee) throws EmployeeCustomeException {
            Optional<Employee> optionalEmployee = this.employeeRepository.findById(employee.getEmployeeId());
            if(optionalEmployee.isEmpty()){
                throw new EmployeeCustomeException("Employee not found");
            }else {
                this.employeeRepository.save(employee);
                return employee;

            }
    }
}