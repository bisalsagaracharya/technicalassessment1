package org.example;

import java.sql.*;

public class EmployeeDriver {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/justfurnishit?characterEncoding=utf8", "root", "Admin@123");

            System.out.println("mysql connection successful !");

            CallableStatement cs = connection.prepareCall("{call employee(?)}");
            cs.setInt(1,);

//            cs.executeUpdate();
            ResultSet result = cs.executeQuery();
            while (cs.next()) {
                foundEmployee = new Employee(result.getInt(1), result.getString("name"), result.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
