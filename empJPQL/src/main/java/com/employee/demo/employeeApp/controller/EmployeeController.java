package com.employee.demo.employeeApp.controller;


import com.employee.demo.employeeApp.dto.EmployeeDTO;
import com.employee.demo.employeeApp.model.Employee;
import com.employee.demo.employeeApp.exception.EmployeeNotFoundException;
import com.employee.demo.employeeApp.repository.EmployeeRepository;
import com.employee.demo.employeeApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/save")
    public EmployeeDTO addEmp(@RequestBody EmployeeDTO employee){
        return employeeService.addEmployee(employee);

    }
    @PutMapping("modify/{emp_id}")
    public EmployeeDTO updateEmp(@PathVariable int emp_id, @RequestBody EmployeeDTO deptReq) throws  EmployeeNotFoundException {
        return employeeService.updateEmp(emp_id,deptReq);
    }
    @DeleteMapping("delete/{emp_id}")
    public void deleteById(@PathVariable int emp_id) throws  EmployeeNotFoundException {
        employeeService.deleteById(emp_id);
    }
    @GetMapping
    public List<EmployeeDTO> showAllDept(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/department/{deptName}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String deptName) {
        return employeeService.getEmployeesByDepartment(deptName);
    }
    @GetMapping("/employee/{firstName}")
    public List<Employee> getEmployeesByEmpName(@PathVariable String firstName) {
        return employeeService.getEmployeesByFirstName(firstName);
    }

}


