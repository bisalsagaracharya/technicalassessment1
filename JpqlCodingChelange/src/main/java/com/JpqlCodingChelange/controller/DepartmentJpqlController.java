package com.JpqlCodingChelange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.repository.DepartmentRepo;

@RestController
public class DepartmentJpqlController {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@GetMapping("/find/{departmentId}")
	public Department findByDepartmentId(@PathVariable ("departmentId")  Integer departmentId) {
		Department findDepartmentByDepartmentId =this.departmentRepo.findDepartmentByDepartmentId(departmentId);
		return findDepartmentByDepartmentId;
	}
	
	@GetMapping("/Alldepartments")
	public List<Department> getAllDepartments() {
		return this.departmentRepo.findAllDepartments();
	}
  
	
	@DeleteMapping("/deleteDepartment/{departmentId}")
	public String deleteDepartmentByDepartmentId(@PathVariable ("departmentId") Integer departmentId) {
		departmentRepo.deleteByDepartmentId(departmentId);
		return "Department delete succusefulyy";
		
    }
	
	@PutMapping("/updateDepartments/{departmentId}")
	public String updateDepartment(@PathVariable ("departmentId") Integer departmentId, String departmentName) {
		departmentRepo.updateDepartment(departmentId,departmentName);
		return "Department upadate succusefulyy";
	
	}

}
