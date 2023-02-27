package com.springcore.ci;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public List<Employee> findAll() {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(
				new Employee(1, "bisal", 12000, "1998-07-12", "2022-09-17", new Address(83, "colllege road", "cuttack")));
		employees.add(
				new Employee(2, "karan", 13000, "2001-01-15", "2022-10-19", new Address(84, "college road", "baleswar")));
		
		employees.add(
				new Employee(3, "govind", 14000, "2004-02-17", "2022-11-20", new Address(85, "Bus Stand", "Bhubaneswar")));

		return employees;
	}
}
