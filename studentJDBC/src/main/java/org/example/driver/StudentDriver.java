package org.example.driver;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.entity.Student;

public class StudentDriver {
	
	   public static void main(String[] args) {
	        StudentDao studentRepo =new StudentDaoImpl();
	              //create
	          Boolean isStudentAdded =false;
	          isStudentAdded = studentRepo.addStudent(new Student(2003,"bisal1","bhubaneswar","bisal@gmail.com"));
	          if(isStudentAdded == true) 
	              System.out.println("Student Added.");
	              else {
	                  System.out.println("Student Could'nt  Added");}
	                  //read
//	                  Student foundStu = studentRepo.getStudent(1);
//	                  if(foundStu !=null)
//	                      System.out.println("Student found:"+foundStu);
//	                  else
//	                      System.out.println("Student could not be found for Id");
//	              }
//
	            // update

//	            boolean isUpdated = studentRepo.updateStudent(new Student(3, "bisal1", ));
//
//	            if (isUpdated == true) {
//	                System.out.println("Student Updated:");
//	                System.out.println("Updated Student:" + studentRepo.getStudent(10));
//	            } else
//	                System.out.println("Employee could not be updated .");

	            // delete

//	            boolean isDeleted = studentRepo.deleteStudent(3);
//
//	            if (isDeleted== true) {
//	                System.out.println("Employee deleted");
//
//	            } else
//	                System.out.println("Employee could not be deleted .");


	          
	    }
	}


