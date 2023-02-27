package com.employee.demo.employeeApp.responseUtil;

import com.employee.demo.employeeApp.dto.DepartmentDTO;
import com.employee.demo.employeeApp.model.Department;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class DepartmentUtil {
    public DepartmentDTO toDepartmentDetail(Department department){
        DepartmentDTO desired=new DepartmentDTO();
        desired.setDepartId(department.getDepartId());
        desired.setDeptName(department.getDeptName());
        desired.setEmployeeList(department.getEmployees());
        return desired;
    }
    public List<DepartmentDTO> toDepartmentDetailsList(Collection<Department> department){
        List<DepartmentDTO>list=  department.stream()
                .map(this::toDepartmentDetail)
                .collect(Collectors.toList());
        return list;
    }
}
