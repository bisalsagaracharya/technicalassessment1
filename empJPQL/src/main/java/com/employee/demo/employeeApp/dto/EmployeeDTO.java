package com.employee.demo.employeeApp.dto;

import com.employee.demo.employeeApp.model.Department;

import lombok.Data;

@Data
public class EmployeeDTO {
    private  int employeeId;
    private String firstName;
    private String lastName;
    private String birthdate;
    private String cellphone;
    private Department department;

}
