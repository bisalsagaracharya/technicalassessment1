package com.employee.demo.employeeApp.dto;

import com.employee.demo.employeeApp.model.Employee;
import lombok.Data;

import java.util.List;
@Data
public class DepartmentDTO {
    private int departId;
    private String deptName;
    private List<Employee> employeeList;
}
