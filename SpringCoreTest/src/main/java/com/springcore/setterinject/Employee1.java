package com.springcore.setterinject;

public class Employee1 {
	 private int emp_id;
	    private String emp_name;
	    private double salary;
	    private String doj;
	    private String dob;
	    private Address1 address;

//	public Employee(int emp_id, String emp_name, double salary, String doj, String dob, Address address) {
//	super();
//	this.emp_id = emp_id;
//	this.emp_name = emp_name;
//	this.salary = salary;
//	this.doj = doj;
//	this.dob = dob;
//	this.address = address;
//}

		public int getEmp_id() {
			return emp_id;
		}

		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}

		public String getEmp_name() {
			return emp_name;
		}

		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDoj() {
			return doj;
		}

		public void setDoj(String doj) {
			this.doj = doj;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public Address1 getAddress() {
			return address;
		}

		public void setAddress(Address1 address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", doj=" + doj
					+ ", dob=" + dob + ", address=" + address + "]";
		}
	    
}
