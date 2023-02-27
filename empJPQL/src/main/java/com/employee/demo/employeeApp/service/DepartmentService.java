package com.employee.demo.employeeApp.service;

import com.employee.demo.employeeApp.dto.DepartmentDTO;
import com.employee.demo.employeeApp.model.Department;
import com.employee.demo.employeeApp.exception.DepartmentNotFoundException;
import com.employee.demo.employeeApp.repository.DepartmentRepository;
import com.employee.demo.employeeApp.responseUtil.DepartmentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements IDepartment{

    private DepartmentRepository repository;
    private DepartmentUtil departmentUtil;


    @Autowired
    public DepartmentService(DepartmentRepository repository,DepartmentUtil departmentUtil) {
        this.repository = repository;
        this.departmentUtil=departmentUtil;
    }

    @Override
    public DepartmentDTO addDepartment(DepartmentDTO department) {
        Department department1 = new Department();
        department1.setDeptName(department.getDeptName());
        department1.setEmployees(department.getEmployeeList());
        repository.save(department1);
        return departmentUtil.toDepartmentDetail(department1);
    }
@Override
    public DepartmentDTO updateDepartment(int deptId, DepartmentDTO deptResponse) throws DepartmentNotFoundException {
        Department department = findById(deptId);
        department.setDeptName(deptResponse.getDeptName());
        repository.save(department);
        return departmentUtil.toDepartmentDetail(department);


    }

    public Department findById(int deptId) throws DepartmentNotFoundException {
        Optional<Department> optional = repository.findById(deptId);
        if (optional.isEmpty()) {
            throw new DepartmentNotFoundException("department not found");
        }
        return optional.get();
    }
    @Override
    public void deleteById(int deptId) throws DepartmentNotFoundException {
        Department department = findById(deptId);
        repository.delete(department);
    }
    @Override
    public List<DepartmentDTO> getAllDept() {
        List<Department> list = repository.findAll();
        return departmentUtil.toDepartmentDetailsList(list);
    }

//

}
