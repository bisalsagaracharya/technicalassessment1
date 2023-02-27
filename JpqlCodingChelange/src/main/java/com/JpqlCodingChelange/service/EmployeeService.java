package com.JpqlCodingChelange.service ;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.entity.Employee;
import com.JpqlCodingChelange.exception.EmployeeException;
import com.JpqlCodingChelange.repository.EmployeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) {
         Employee employee1=this.employeeRepo.save(employee);
         return employee1;

    }

    public Employee modifyEmployee( Employee employee, Integer employeeId) throws EmployeeException {
        Optional<Employee> found = this.employeeRepo.findById(employee.getEmployeeId());
       if(found.isEmpty()){
           throw  new EmployeeException("Employee Id not found");
       }
           this.employeeRepo.save(employee);
        return employee;
    }

    public Boolean deleteEmployeeById(Integer employeeId) throws EmployeeException {
        Optional<Employee> findById = this.employeeRepo.findById(employeeId);
        if (findById.isPresent()) {
            employeeRepo.deleteById(employeeId);
            return true;
        } else {
            throw new EmployeeException("employee not exit");
        }
    }

    public Department getEmployeeById(Integer employeeId) throws EmployeeException {
        Optional<Employee> found=this.employeeRepo.findById(employeeId);
        Department department=found.get().getDepartment();
        if(found.isEmpty()){
            throw  new EmployeeException("Employee for Id not present");
        }else{
            return department;
        }

    }

    public List<Employee> findByFirstName(String firstName) {
        List<Employee> emp = this.employeeRepo.findByFirstName(firstName);
        return  emp;
    }




}
