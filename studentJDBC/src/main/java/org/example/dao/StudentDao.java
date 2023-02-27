package org.example.dao;

import org.example.entity.Student;

public interface StudentDao {
	
	 
	    Boolean addStudent(Student newStudent);

	    Student getStudent(Integer studentId);

	    Boolean updateStudent(Student updateStudent);// update all attributes except id


	    Boolean deleteStudent(Integer studentId);

	}


