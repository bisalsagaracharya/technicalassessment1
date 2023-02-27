package com.Shopping.service;

import com.Shopping.dto.Student;
import com.Shopping.exception.StudentException;
import com.Shopping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addNewStudent(Student student) {
        return this.studentRepository.save(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }
    @Override
    public Student updateStudent(Student student) {
        return this.studentRepository.save(student);
    }
    @Override
    public Student deleteById(Integer id) throws StudentException {
        Optional<Student> student = this.studentRepository.findById(id);
        if (student.isEmpty()) {
            throw new StudentException("Student not available");
        } else {
            this.studentRepository.deleteById(id);
        }
        return null;
    }
}
