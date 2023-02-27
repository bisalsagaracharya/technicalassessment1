package com.user.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "user")
public class User {
    
	@Id
	private String id;
	
	private String name;
	private String email;
	private Double salary;
	private String address;
	
	public User() {
		super();
	 
	}

	public User(String id, String name, String email, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
