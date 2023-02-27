package com.employee.demo.employeeApp.service;

import com.employee.demo.employeeApp.dto.EmployeeDTO;
import com.employee.demo.employeeApp.model.Employee;
import com.employee.demo.employeeApp.exception.EmployeeNotFoundException;
import com.employee.demo.employeeApp.repository.EmployeeRepository;
import com.employee.demo.employeeApp.responseUtil.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService implements IEmployee{

    private EmployeeRepository employeeRepository;

    private EmployeeUtil employeeUtil;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository,EmployeeUtil employeeUtil){
        this.employeeRepository=employeeRepository;
        this.employeeUtil=employeeUtil;

    }
@Override
    public EmployeeDTO addEmployee(EmployeeDTO empRequest){
        Employee employee=new Employee();
        employee.setFirstName(empRequest.getFirstName());
        employee.setLastName(empRequest.getLastName());
        employee.setBirthdate(empRequest.getBirthdate());
        employee.setCellphone(empRequest.getCellphone());
        employee.setDepartment(empRequest.getDepartment());
        employeeRepository.save(employee);
        return employeeUtil.toEmpDetail(employee);
    }
    public Employee findById(int empId) throws EmployeeNotFoundException {
        Optional<Employee> optional=employeeRepository.findById(empId);
        if(optional.isEmpty()){
            throw new EmployeeNotFoundException("employee not found");
        }
        return optional.get();
    }
    @Override
    public EmployeeDTO updateEmp(int empId, EmployeeDTO emp) throws EmployeeNotFoundException {
        Employee employee=findById(empId);
        employee.setBirthdate(emp.getBirthdate());
        employee.setCellphone(emp.getCellphone());
        employeeRepository.save(employee);
        return employeeUtil.toEmpDetail(employee);


    }
    @Override
    public void deleteById(int empId) throws EmployeeNotFoundException  {
        Employee employee=findById(empId);
        employeeRepository.delete(employee);
    }
    @Override
    public List<EmployeeDTO> getAllEmployee(){
        List<Employee> list=employeeRepository.findAll();
        return employeeUtil.toEmpDetailsList(list);
    }
    @Transactional
    public List<Employee> getEmployeesByDepartment(String deptName) {
        return employeeRepository.findByDepartmentName(deptName);
    }
    @Transactional
    public List<Employee> getEmployeesByFirstName(String firstName) {
        return employeeRepository.findEmployeeByFirstName(firstName);
    }



}
