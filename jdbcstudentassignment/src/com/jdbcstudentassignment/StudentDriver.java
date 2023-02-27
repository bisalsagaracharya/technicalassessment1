package com.jdbcstudentassignment;

public class StudentDriver {
	
	   public static void main(String[] args) {
	        StudentDao studentRepo =new StudentDaoImpl();
	              //create
	          Boolean isStudentAdded =false;
	          isStudentAdded = studentRepo.addStudent(new Student(9, "student 8",80000.00));
	          if(isStudentAdded == true) 
	              System.out.println("Student Added.");
	              else {
	                  System.out.println("Student Could'nt  Added");
	                  //read
	                  Student foundStu = studentRepo.getStudent(4);
	                  if(foundStu !=null)
	                      System.out.println("Student found:"+foundStu);
	                  else
	                      System.out.println("Student could not be found for Id");
	              }
	          
	            // update

	            boolean isUpdated = studentRepo.updateStudent(new Student(3, "bisal1", 450.0));

	            if (isUpdated == true) {
	                System.out.println("Student Updated:");
	                System.out.println("Updated Student:" + studentRepo.getStudent(10));
	            } else
	                System.out.println("Employee could not be updated .");

	            // delete

	            boolean isDeleted = studentRepo.deleteStudent(3);

	            if (isDeleted== true) {
	                System.out.println("Employee deleted");

	            } else
	                System.out.println("Employee could not be deleted .");


	          
	    }
	}


