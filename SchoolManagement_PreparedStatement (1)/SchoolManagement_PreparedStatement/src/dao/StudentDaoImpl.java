package dao;

import dto.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private Connection connection;

    public StudentDaoImpl() {
        super();
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/School", "postgres", "Global@123");
            System.out.println("PostGres connection successful !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Add student
    @Override
    public Boolean addStudent(Student newStudent) {

        Boolean isRecordAdded = false;
        String sql = "INSERT INTO student(studentId, studentName, studentAddress, studentEmail) VALUES(?,?,?,?)";
        // Prepared statement to construct dynamic query
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setInt(1, newStudent.getStudentId());
            preparedStatement.setString(2, newStudent.getStudentName());
            preparedStatement.setString(3, newStudent.getStudentAddress());
            preparedStatement.setString(4, newStudent.getStudentEmail());
            System.out.println("prepared statement:" + preparedStatement);
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount == 1)
                isRecordAdded = true;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return isRecordAdded;
    }

    // FindById
    @Override
    public Student findStudentByStudentId(Integer studentId) {
        String sql = "SELECT studentId, studentName, studentAddress, studentEmail FROM student WHERE studentId = ?";
        Student foundStudent = null;

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()) {
                foundStudent = new Student(result.getInt("studentId"), result.getString("studentName"), result.getString("studentAddress"), result.getString("studentEmail"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return foundStudent;

    }

    //get All
    @Override
    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";
        try {
            Statement statement = this.connection.createStatement();
//            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
//            ResultSet result = preparedStatement.executeQuery(sql);
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
//                System.out.println(result.getInt(1));
//                System.out.println(result.getString(2));
//                System.out.println(result.getString(3));
//                System.out.println(result.getString(4));

                Student newStudent = new Student(result.getInt("studentId"), result.getString("studentName"),
                        result.getString("studentAddress"), result.getString("studentEmail"));
                students.add(newStudent);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }


    @Override
    public Boolean updateStudent(Student student) {

        Boolean isRecodUpdated = false;
        String sql = "UPDATE student SET studentName = ? , studentAddress = ? , studentEmail =? WHERE studentId= ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getStudentAddress());
            preparedStatement.setString(3, student.getStudentEmail());
            preparedStatement.setInt(4, student.getStudentId());

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
        String sql = "DELETE FROM student WHERE studentId = ?";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setInt(1, studentId);

            int count = preparedStatement.executeUpdate();
            if (count == 1)
                isRecodDeleted = true;

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return isRecodDeleted;
    }
}
