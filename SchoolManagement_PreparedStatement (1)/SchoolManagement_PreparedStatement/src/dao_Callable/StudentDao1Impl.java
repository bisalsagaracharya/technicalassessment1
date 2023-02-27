package dao_Callable;

import dto.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao1Impl implements StudentDao1 {

    private Connection connection;

    public StudentDao1Impl() {
        super();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Admin@123");
            System.out.println("Mysql connection successful !");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Add student
    @Override
    public Boolean addStudent(Student newStudent) {

        Boolean isRecordAdded = false;
//        String sql = "INSERT INTO student(studentId, studentName, studentAddress, studentEmail) VALUES(?,?,?,?)";
        // Callable statement to construct dynamic query
        try {
            CallableStatement cs = this.connection.prepareCall("{call addStudent(?,?,?,?)}");
            cs.setInt(1, newStudent.getStudentId());
            cs.setString(2, newStudent.getStudentName());
            cs.setString(3, newStudent.getStudentAddress());
            cs.setString(4, newStudent.getStudentEmail());
            int count = cs.executeUpdate();
            if (count == 1)
                isRecordAdded = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isRecordAdded;
    }

    // FindById
    @Override
    public Student findStudentByStudentId(Integer studentId) {
//        String sql = "SELECT studentId, studentName, studentAddress, studentEmail FROM student WHERE studentId = ?";
        Student foundStudent = null;

        try {
            CallableStatement cs = this.connection.prepareCall("{call findStudent(?)}");
            cs.setInt(1, studentId);
//            cs.executeUpdate();
            ResultSet result = cs.executeQuery();
            while (result.next()) {
                foundStudent = new Student(result.getInt(1), result.getString("studentName"), result.getString("studentAddress"), result.getString("studentEmail"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return foundStudent;

//        return false;
    }

    //get All
    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
//        String sql = "SELECT * FROM student";
        try {
            CallableStatement cs = this.connection.prepareCall("{call getStudent()}");
            ResultSet result = cs.executeQuery();

            while (result.next()) {
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @Override
    public Boolean updateStudent(Student student) {

        Boolean isRecodUpdated = false;
//        String sql = "UPDATE student SET studentName = ? , studentAddress = ? , studentEmail =? WHERE studentId= ?";
        try {
            CallableStatement cs = this.connection.prepareCall("{call updateStudent(?,?,?,?)}");
            cs.setString(1, student.getStudentName());
            cs.setString(2, student.getStudentAddress());
            cs.setString(3, student.getStudentEmail());
            cs.setInt(4, student.getStudentId());

            int count = cs.executeUpdate();

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
//        String sql = "DELETE FROM student WHERE studentId = ?";

        try {
            CallableStatement cs = this.connection.prepareCall("{ call deleteStudent(?)}");
//            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
//
            cs.setInt(1, studentId);
            int count = cs.executeUpdate();
//            int count = preparedStatement.executeUpdate();
            if (count == 1)
                isRecodDeleted = true;

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return isRecodDeleted;
    }
}
