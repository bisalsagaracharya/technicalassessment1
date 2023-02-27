package dao_Callable;

import dto.Student;

import java.util.List;

public interface StudentDao1 {

    Boolean addStudent(Student newStudent);
   public Student findStudentByStudentId(Integer studentid);
    List<Student> getAllStudents();
   Boolean updateStudent(Student student);
   Boolean deleteStudent(Integer studentId);
}
