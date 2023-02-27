package com.Shopping.service;

import com.Shopping.dto.Course;
import com.Shopping.dto.Student;
import com.Shopping.exception.StudentException;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student addNewStudent(Student student);
    List<Student> getAllStudents();

    Student updateStudent(Student student);

    Student deleteById(Integer id) throws StudentException;
}
