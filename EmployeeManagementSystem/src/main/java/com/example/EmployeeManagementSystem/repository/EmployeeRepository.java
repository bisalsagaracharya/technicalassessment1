package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findEmployeeByEmployeeId(Long employeeId);


    //Employee findEmployeeByEmployeeName(String employeeName);
}
