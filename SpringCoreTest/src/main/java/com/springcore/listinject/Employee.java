package com.springcore.listinject;

import java.sql.Date;
import java.util.List;

public class Employee {
	private int emp_id;
	private String emp_name;
	private double salary;
	private String doj;
	private String dob;
//    private List<String> addresses;
	private Address addressDetails;
	public Employee(int emp_id, String emp_name, double salary, String doj, String dob,
			Address addressDetails) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.doj = doj;
		this.dob = dob;
//		this.addresses = addresses;
		this.addressDetails = addressDetails;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", doj=" + doj
				+ ", dob=" + dob + ", addressDetails=" + addressDetails + "]";
	}

	

}
