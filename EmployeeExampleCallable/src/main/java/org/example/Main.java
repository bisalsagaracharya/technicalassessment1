package org.example;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        EmployeeDao employeeDao=new EmployeeDaoImpl();

        //Add Employee
//        Employee employee=employeeDao.addEmployee(new Employee(107,"bisal","ctc"));
//        if(employee.equals(employee)){
//            System.out.println("Employee added successfully");
//        }else {
//            System.out.println("Employee not added");
//        }

        //GetAllEmployee

        List<Employee> employee1=employeeDao.getAllEmployee();
        if(employee1.equals(employee1)){
            System.out.println("Employee added successfully");
        }else {
            System.out.println("Employee not added");
        }
    }
}