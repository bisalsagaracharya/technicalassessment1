package com.unidirectionalExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unidirectionalExample.entity.Department;
import com.unidirectionalExample.exception.DepartmentException;
import com.unidirectionalExample.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/addDepartment")
	public String addDepartment(@RequestBody  Department department) {
		this.departmentRepository.save(department);
		return"Record save successfully!!";
	}
	
	@GetMapping("/getAllDepartment")
	public  List<Department> getAllDepartment() {
		List<Department> findAllDepartments = this.departmentRepository.findAllDepartments();
		return findAllDepartments;
	}
	
	@GetMapping("/getById/{id}")
	public Department findById(@PathVariable ("id") Integer id) {
		 return this.departmentRepository.findDepartmentById(id);
		 
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable ("id") Integer id) {
		this.departmentRepository.deleteById(id);
		return "Department Delete Successfully!!";
	}
	
	@PutMapping("/updateById/{id}")
	public String updateDepartment(@PathVariable ("id") Integer id, String name) {
		departmentRepository.updateDepartment(id,name);
		return "Department upadate succusefulyy";
	
	}
	
	 @PutMapping("updateDepartment/{id}")
	 public Department updateDepartment(@RequestBody Department department,@PathVariable ("id")  Integer id) throws DepartmentException {
	        Optional<Department> found = this.departmentRepository.findById(department.getId());
	        if(found.isEmpty()) {
	            throw  new DepartmentException("DepartmentId not found");
	        }
	        Department dept = this.departmentRepository.save(department);

	        return dept;
	    }
}
