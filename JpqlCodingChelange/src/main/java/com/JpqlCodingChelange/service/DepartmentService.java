package  com.JpqlCodingChelange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpqlCodingChelange.entity.Department;
import com.JpqlCodingChelange.entity.Employee;
import com.JpqlCodingChelange.exception.DepartmentException;
import com.JpqlCodingChelange.repository.DepartmentRepo;
import com.JpqlCodingChelange.repository.EmployeeRepo;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    
    @Autowired
    private EmployeeRepo employeeRepo;

    public Department adddepartment(Department department) {

        return this.departmentRepo.save(department);
    }

    public Department updateDepartment(Department department,Integer departmentId) throws DepartmentException {
        Optional<Department> found = this.departmentRepo.findById(department.getDepartmentId());
        if(found.isEmpty()) {
            throw  new DepartmentException("Department_Id not found");
        }
        Department dept = this.departmentRepo.save(department);

        return department;
    }

    public Boolean deleteDepartmentById(Integer departmentId) throws DepartmentException {
        Optional<Department> findById = this.departmentRepo.findById(departmentId);
        if (findById.isPresent()) {
            departmentRepo.deleteById(departmentId);
            return true;
        } else {
            throw new DepartmentException("department not exit");
        }
    }

    public List<Department> getAllDepartment() {
        return this.departmentRepo.findAll();
    }

    public List<Department> getEmployeeByDepartmentName(String departmentName) {
        return this.departmentRepo.findByDepartmentName(departmentName);
    }
    
    
}
