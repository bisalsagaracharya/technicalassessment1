package  com.JpqlCodingChelange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.exception.DepartmentException;
import com.JpqlCodingChelange.service.DepartmentService;



@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("department")
    Department addDepartment(@RequestBody Department department){
        return  this.departmentService.adddepartment(department);
    }
    @PutMapping("department/{departmentId}")
    Department modifyDepartment( @RequestBody Department department,@PathVariable Integer departmentId) throws DepartmentException {
        return this.departmentService.updateDepartment(department,departmentId);
    }
    @DeleteMapping("department/{departmentId}")
    String deleteDepartment(@PathVariable ("departmentId")Integer departmentId) throws DepartmentException {
        this.departmentService.deleteDepartmentById(departmentId);
        return  "Department deleted successfully,";
    }
    @GetMapping("department/{departmentName}")
    List<Department> getEmployeeByDepartment(@PathVariable  String departmentName){
        return  this.departmentService.getEmployeeByDepartmentName(departmentName);
    }
    @GetMapping("departments")
    List<Department> getAllDepartments(){
        return  this.departmentService.getAllDepartment();
    }
}
