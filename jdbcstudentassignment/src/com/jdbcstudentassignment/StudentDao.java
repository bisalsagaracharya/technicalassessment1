package com.jdbcstudentassignment;

public interface StudentDao {
	
	 
	    Boolean addStudent(Student newStudent);

	    Student getStudent(Integer studentId);

	    Boolean updateStudent(Student updateStudent);// update all attributes except id

	    Boolean updateStudentName(Integer studentId, String name);

	    Boolean deleteStudent(Integer studentId);

	}


