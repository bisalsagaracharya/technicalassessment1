package com.globallogic.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    
    String url = "jdbc:mysql://localhost:3306/gaming";
    String username = "root";
    String password = "Admin@123";

    /**
     * Connect to the mysql database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
