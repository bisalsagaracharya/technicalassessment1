package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {

    public static void main(String[] args) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "Admin@123");

                System.out.println("mysql connection successful !");

                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery("SELECT * from customers c JOIN (select orders.customerNumber ,sum(orderdetails.quantityOrdered *orderdetails.priceEach) as TotalSum from orders \n" +
                        " JOIN orderdetails ON orders.orderNumber=orderdetails.orderNumber \n" +
                        "where orders.orderDate  BETWEEN '2003-02-01' AND  '2003-05-01' GROUP By orders.customerNumber  order by TotalSum desc limit 1) \n" +
                        "t ON c.customerNumber =t.customerNumber;");
                while (result.next()) {

                    System.out.println("customerNumber: :"+result.getString(1)+"\n"+"customerName: :"+result.getString(2)
                            +"\n" +"contactLastName: :"+result.getString(3)+"\n"+"contactFirstName: :"+result.getString(4)+
                            "\n"+"phone: :"+result.getString(5)+"\n"+"addressLine1: :"+result.getString(6)+
                            "\n"+"addressLine2: :"+result.getString(7)+"\n"+"city: :"+result.getString(8)+
                            "\n"+"state: :"+result.getString(9)+"\n"+"postalCode: :"+result.getString(10)+
                            "\n"+"country: :"+result.getString(11)+"\n"+"salesRepEmployeeNumber"+result.getString(12)+
                            "\n"+"creditLimit: :"+result.getString(13)+"\n"+"customerNumber: :"+result.getString(14)+
                            "\n"+"TotalSum: :"+result.getString(15));
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

