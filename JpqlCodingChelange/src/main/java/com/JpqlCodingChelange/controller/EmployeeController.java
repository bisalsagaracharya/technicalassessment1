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
import com.JpqlCodingChelange.entity.Employee;
import com.JpqlCodingChelange.exception.EmployeeException;
import com.JpqlCodingChelange.service.EmployeeService;

 

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
   
    @PostMapping("employee")
    String addNewEmployee(@RequestBody Employee employee){
       this.employeeService.addEmployee(employee);
       return"Employee save successfully";
         
    }
    @PutMapping("employee/{employeeId}")
    Employee modifyEmployee( @RequestBody Employee employee , @PathVariable ("employeeId")Integer employeeId) throws EmployeeException {
        return  this.employeeService.modifyEmployee(employee,employeeId);
    }
    @DeleteMapping("employee/{employeeId}")
    String deleteEmployeeById(@PathVariable ("employeeId")Integer employeeId) throws EmployeeException {
        this.employeeService.deleteEmployeeById(employeeId);
        return "Employee deleted successfully";
    }
    @GetMapping("employeeId/{employeeId}")
    Department getEmployeeById(@PathVariable("employeeId") Integer employeeId) throws EmployeeException {
        return this.employeeService.getEmployeeById(employeeId);
    }

    @GetMapping("employeeName/{firstName}")
    List<Employee> getEmployeeByName(@PathVariable String firstName){
        return this.employeeService.findByFirstName(firstName);
    }
    
    
}
