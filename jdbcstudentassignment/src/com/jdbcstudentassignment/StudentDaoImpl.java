package com.jdbcstudentassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl  implements StudentDao{
    private Connection con;
    public StudentDaoImpl() {
        super();
         try {
            con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee_details", "postgres", "P@ssw0rd");
            System.out.println("PostGres connection successful !");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
        
    

    @Override
    public Boolean addStudent(Student newStudent) {
        Boolean isStudentRecordAdded =false;
        String sql ="Insert into student(Id,sname,sfess) Values(?,?,?)";
        try {
            PreparedStatement prepStatement = this.con.prepareStatement(sql);
            prepStatement.setInt(1, newStudent.getStudentId());
            prepStatement.setString(2, newStudent.getStudentName());
            prepStatement.setDouble(3, newStudent.getStudentFess());
            System.out.println("Prepared Statement:"+prepStatement);
               int recordCount = prepStatement.executeUpdate();
               if(recordCount ==1) {
                   isStudentRecordAdded =true;
                   
                   
               }
               } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return isStudentRecordAdded;
    }

    @Override
    public Student getStudent(Integer studentId) {
        String sql ="select Id,sname,sfess from student where Id =?";
        Student foundStudent =null;
        try {
            PreparedStatement prepStatement =this.con.prepareStatement(sql);
            prepStatement.setInt(1, studentId);
            ResultSet result   = prepStatement.executeQuery();
                if(result.next()) {
                    foundStudent = new Student(result.getInt("Id"),result.getString("sname"),result.getDouble("sfess"));
                    
                    
                }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return foundStudent;
    }

    @Override
    public Boolean updateStudent(Student updateStudent) {
        

            Boolean isRecodUpdated = false;
            String sql = "UPDATE student SET sName = ? , sFess = ? WHERE Id = ?";

            try {
                PreparedStatement preparedStatement = this.con.prepareStatement(sql);
                preparedStatement.setString(1, updateStudent.getStudentName());
                preparedStatement.setDouble(2, updateStudent.getStudentFess());
                preparedStatement.setInt(3, updateStudent.getStudentId());
                int count = preparedStatement.executeUpdate();
                if (count == 1)
                    isRecodUpdated = true;

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return isRecodUpdated;
        }
        

    @Override
    public Boolean updateStudentName(Integer studentId, String name) {
        return null;
    }

    @Override
    public Boolean deleteStudent(Integer studentId) {
        
            Boolean isRecodDeleted = false;
            String sql = "DELETE FROM student WHERE Id = ? ";

            try {
                PreparedStatement preparedStatement = this.con.prepareStatement(sql);

                preparedStatement.setInt(1, studentId);

                int count = preparedStatement.executeUpdate();
                if (count == 1)
                    isRecodDeleted = true;

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return isRecodDeleted;
        
    }
}
