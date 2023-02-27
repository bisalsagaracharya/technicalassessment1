package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private Connection connection;

    public EmployeeDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Admin@123");
            System.out.println("Database connection successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


    @Override
    public Employee addEmployee(Employee employee) throws SQLException {
        try {
            CallableStatement callableStatement = this.connection.prepareCall("call insertEmployee(?,?,?)");
            callableStatement.setInt(1, employee.geteId());
            callableStatement.setString(2, employee.geteName());
            callableStatement.setString(3, employee.geteAddress());
            callableStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("duplicate employee");
        }
        return employee;

    }


    @Override
    public List<Employee> getAllEmployee() throws SQLException {
        List<Employee> employee=new ArrayList<>();
        try {
            CallableStatement callableStatement = this.connection.prepareCall("call getAllEmployee()");
            ResultSet rs =callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(new Employee(rs.getInt("eId"),rs.getString("eName"),rs.getString("eAddress")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("data not found");
        }
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws SQLException{
        try {
            CallableStatement callableStatement = this.connection.prepareCall("call updateEmployee(?,?,?)");
            callableStatement.setInt(1,employee.geteId());
            callableStatement.setString(2,employee.geteName());
            callableStatement.setString(3,employee.geteAddress());
            int emp=callableStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employee;
    }

    @Override
    public Boolean deleteEmployee(Integer eId) {
        return null;
    }
}
