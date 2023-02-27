package exceptionassignment1;

import java.util.Scanner;

public class DriverEmpSalary {

	public static void main(String[] args) {
		 

		   Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Salary :");
		             Double salary=sc.nextDouble();
	            

	    //double salary =2000.00;
	try {
	    if(salary<3000.00) {
	        throw new EmployeeSalaryException("Employe  Having Less Salary Than 3000.00");
	    }
	}catch(EmployeeSalaryException e) {
	    System.out.println(e);

	    
	}
	if(salary>3000) {
	System.out.println("Your Salary Is More Than 3000.00");
	}
	    }
	
	}


