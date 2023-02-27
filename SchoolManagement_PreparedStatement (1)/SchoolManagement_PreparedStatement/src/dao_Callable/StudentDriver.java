package dao_Callable;

import dao.StudentDao;
import dao.StudentDaoImpl;
import dto.Student;

public class StudentDriver {
    public static void main(String[] args) {

        StudentDao1 studentDao = new StudentDao1Impl();

        // Add
        Boolean isStudentAdded = false;
        isStudentAdded = studentDao.addStudent(new Student(1010, "Soham", "Pune", "soham123@gmail.com"));

        if (isStudentAdded == true)
            System.out.println("Student added.");
        else
            System.out.println("Student could't be added.");


//        // findById
        System.out.println(studentDao.findStudentByStudentId(1001) + " : Id found");
        Student foundStudent = studentDao.findStudentByStudentId(1001);
        if (foundStudent != null)
            System.out.println("Student found:" + foundStudent);
        else
            System.out.println("Student could not be found for id.");

//        //Read All
        System.out.println("List of all Students:");
        System.out.println(studentDao.getAllStudents());

//        //Update

        boolean isUpdated = studentDao.updateStudent(new Student(1010, "Ajit", "Shirdi", "sujit@gmail.com"));

        if (isUpdated == true) {
            System.out.println("Student Updated:");
            System.out.println("Updated Student:" + studentDao.findStudentByStudentId(1002));
        } else
            System.out.println("Student could not be updated .");


//        //Delete
        boolean isDeleted = studentDao.deleteStudent(1002);

        if (isDeleted == true) {
            System.out.println("Student deleted");

        } else
            System.out.println("Student could not be deleted .");

    }
}
