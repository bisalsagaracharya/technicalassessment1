package com.employee.demo.employeeApp.responseUtil;

import com.employee.demo.employeeApp.dto.EmployeeDTO;
import com.employee.demo.employeeApp.model.Employee;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeUtil {
    public EmployeeDTO toEmpDetail(Employee employee){
        EmployeeDTO desired=new EmployeeDTO();
        desired.setEmployeeId(employee.getEmployeeId());
        desired.setFirstName(employee.getFirstName());
        desired.setLastName(employee.getLastName());
        desired.setBirthdate(employee.getBirthdate());
        desired.setCellphone(employee.getCellphone());
        desired.setDepartment(employee.getDepartment());
        return desired;
    }
    public List<EmployeeDTO> toEmpDetailsList(Collection<Employee> employees){
        List<EmployeeDTO>list=  employees.stream()
                .map(this::toEmpDetail)
                .collect(Collectors.toList());
        return list;
    }
}
