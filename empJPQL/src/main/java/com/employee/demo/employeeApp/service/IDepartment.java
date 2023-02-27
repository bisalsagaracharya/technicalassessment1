package com.employee.demo.employeeApp.service;

import com.employee.demo.employeeApp.dto.DepartmentDTO;
import com.employee.demo.employeeApp.exception.DepartmentNotFoundException;

import java.util.List;

public interface IDepartment {
    DepartmentDTO addDepartment(DepartmentDTO department);
    DepartmentDTO updateDepartment(int deptId, DepartmentDTO deptResponse) throws DepartmentNotFoundException;
    void deleteById(int deptId) throws DepartmentNotFoundException;
    List<DepartmentDTO> getAllDept();
}
