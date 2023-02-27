package exceptionassignment1;

public class DriverEmp {
	
	public void processName(String firstName,String lastName) throws EmployeeNameException {
		 
		if(firstName.isEmpty() && lastName.isEmpty()) {
			
			throw new EmployeeNameException("Employee First and Last name missing");
			
		}else if(firstName.isEmpty()) {
			throw new EmployeeNameException("Employee First name is missing");
			
		}
		
		else if(lastName.isEmpty()) {
			throw new EmployeeNameException("Employee Last name is missing");
		}
	}
	
	
	public static void main(String[] arrg) {
		
		Employee emp=new Employee();
		emp.setFirstName(" bisal");
		emp.setLastName("acharya");
		
		
		DriverEmp d=new DriverEmp();
		
		
	
		try {
			d.processName(emp.getFirstName(),emp.getLastName());
			System.out.println("Employee name is"+emp.getFirstName()+" "+emp.getLastName());
			 
			
		} catch (Exception e) {
			System.out.println("invelid name "+e.getMessage());
			 
		}

	}



 
		 
		

	}


