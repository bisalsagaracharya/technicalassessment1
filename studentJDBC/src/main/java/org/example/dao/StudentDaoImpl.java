package org.example.dao;

import org.example.entity.Student;

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
             Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/justfurnishit?characterEncoding=utf8", "root", "Admin@123");
            System.out.println("mysql connection successful !");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
        
    

    @Override
    public Boolean addStudent(Student newStudent) {
        Boolean isStudentRecordAdded =false;
        String sql ="Insert into student(studentId,studentName,studentAddress,studentEmail) Values(?,?,?,?)";
        try {
            PreparedStatement prepStatement = this.con.prepareStatement(sql);
            prepStatement.setInt(1, newStudent.getStudentId());
            prepStatement.setString(2, newStudent.getStudentName());
            prepStatement.setString(3, newStudent.getStudentAddress());
            prepStatement.setString(4, newStudent.getStudentEmail());
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
        String sql ="select studentId,studentName,studentAddress,studentEmail from student where studentId =?";
        Student foundStudent =null;
        try {
            PreparedStatement prepStatement =this.con.prepareStatement(sql);
            prepStatement.setInt(1, studentId);
            ResultSet result   = prepStatement.executeQuery();
                if(result.next()) {
                    foundStudent = new Student(result.getInt("studentId"),result.getString("studentName"),result.getString("studentAddress"),result.getString("studentEmail"));
                    
                    
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
            String sql = "UPDATE student SET studentName = ? , studentAddress = ? , studentEmail = ? WHERE studentId = ?";

            try {
                PreparedStatement preparedStatement = this.con.prepareStatement(sql);
                preparedStatement.setInt(1, updateStudent.getStudentId());
                preparedStatement.setString(2, updateStudent.getStudentName());
                preparedStatement.setString(3, updateStudent.getStudentAddress());
                preparedStatement.setString(4, updateStudent.getStudentEmail());
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
