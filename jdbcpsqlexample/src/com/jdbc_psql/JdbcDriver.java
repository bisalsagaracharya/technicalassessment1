package com.jdbc_psql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDriver {

	public static void main(String[] args) {
		  
			 
			 try {
				Connection conection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee_details","postgres","P@ssw0rd");
				System.out.println("Postgres connection successfully !");
			    
				 Statement statement=conection.createStatement();
				 ResultSet result = statement.executeQuery("SELECT * FROM employee1");
				 while (result.next()) {
					 System.out.print(" id:"+result.getInt(1));
					 System.out.print(" name:"+result.getString("name"));
					 System.out.print(" salary:"+result.getDouble("salary"));
				 }
				
				
			} catch (SQLException e) {
				 e.printStackTrace();
			}
		 
			 
		}
		

	}


