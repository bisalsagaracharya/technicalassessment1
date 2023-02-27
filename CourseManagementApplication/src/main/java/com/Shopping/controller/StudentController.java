package com.Shopping.controller;

import com.Shopping.dto.Student;
import com.Shopping.exception.StudentException;
import com.Shopping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("student")
    public Student addNewStudent(@RequestBody Student student){
        Student student1 =studentService.addNewStudent(student);
        return student1;
    }
    @GetMapping("students")
    public List<Student> getListOfStudents(){
        return this.studentService.getAllStudents();
    }

    @PutMapping("student")
    public String updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
        return "Student got updated successfully";
    }

    @DeleteMapping("student/{id}")
    public String deleteStudentByName(@PathVariable("id") Integer id) throws StudentException {
        this.studentService.deleteById(id);
        return "Student got deleted successfully";
    }
}
