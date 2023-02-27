package com.employee.demo.employeeApp.controller;


import com.employee.demo.employeeApp.dto.DepartmentDTO;
import com.employee.demo.employeeApp.exception.DepartmentNotFoundException;
import com.employee.demo.employeeApp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public DepartmentDTO addDepartment(@RequestBody DepartmentDTO department){
        return departmentService.addDepartment(department);

    }
    @PutMapping("/modify/{dept_id}")
    public DepartmentDTO updateDept(@PathVariable int dept_id, @RequestBody DepartmentDTO deptReq) throws DepartmentNotFoundException {
        return departmentService.updateDepartment(dept_id,deptReq);
    }
    @DeleteMapping("/delete/{dept_id}")
    public void deleteById(@PathVariable int dept_id) throws DepartmentNotFoundException {
        departmentService.deleteById(dept_id);
    }
    @GetMapping
    public List<DepartmentDTO> showAllDept(){

        return departmentService.getAllDept();
    }

}
