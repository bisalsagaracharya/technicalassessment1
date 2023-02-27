package com.JpqlCodingChelange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.entity.Employee;
import com.JpqlCodingChelange.repository.EmployeeRepo;



@RestController
public class EmployeeJpqlController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return this.employeeRepo.findAllEmployee();
	}

	@GetMapping("employee/department/{employeeId}")
	public Department getDepartmentOfEmployeeByid(@PathVariable("employeeId") Integer employeeId) {
		return this.employeeRepo.findEmployeeByEmployeeId(employeeId).getDepartment();
	}
	
	@GetMapping("employee/name/{firstName}")
	public List<Employee> getAllEmployeesByName(@PathVariable("firstName") String firstName) {
		return this.employeeRepo.findByFirstNameContaining(firstName);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public String deleteEmployeeByEmployeeId(@PathVariable ("employeeId") Integer employeeId) {
		employeeRepo.deleteByEmployeeId(employeeId);
		return "Employee delete succusefulyy";
		
    }
	
	@PutMapping("/updateEmployee/{employeeId}")
	public String updateEmployee(@PathVariable ("employeeId") Integer employeeId, String firstName,String lastName,String birthdate,Long cellphone) {
		employeeRepo.updateEmployee(employeeId, firstName,lastName,birthdate,cellphone);
		return "Employee upadate succusefulyy";
	
	
	}	
	
}
