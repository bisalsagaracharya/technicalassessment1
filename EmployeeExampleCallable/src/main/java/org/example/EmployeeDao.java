package org.example;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    Employee addEmployee(Employee employee) throws SQLException;
    List<Employee> getAllEmployee()throws SQLException;
    Employee updateEmployee(Employee employee)throws SQLException;
    Boolean deleteEmployee(Integer eId)throws  SQLException;
}
