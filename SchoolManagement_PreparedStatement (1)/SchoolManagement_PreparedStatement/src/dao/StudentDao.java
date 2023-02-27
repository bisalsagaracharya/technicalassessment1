package dao;

import dto.Student;

import java.util.List;

public interface StudentDao {

    Boolean addStudent(Student newStudent);
    public Student findStudentByStudentId(Integer studentid);
    List<Student> getAllStudents();
    Boolean updateStudent(Student student);
    Boolean deleteStudent(Integer studentId);
}
