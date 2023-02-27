package com.springcore.ci;


public class Employee {
	
	private int empId;
	private String empName;
	private int salary;
	private String dob;
	private String doj;
	private Address address;
	
    

	public Employee(int empId, String empName, int salary, String dob, String doj, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getDoj() {
		return doj;
	}



	public void setDoj(String doj) {
		this.doj = doj;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dob=" + dob + ", doj="
				+ doj + ", address=" + address + "]";
	}


 
	 
	

}
