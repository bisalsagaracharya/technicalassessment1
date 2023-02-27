package com.spring.demo;

public class Student {
	
	private int id;
	private String name;
	private Double fess;
	
	public Student() {
		super();
	}

	public Student(int id, String name, Double fess) {
		super();
		this.id = id;
		this.name = name;
		this.fess = fess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFess() {
		return fess;
	}

	public void setFess(Double fess) {
		this.fess = fess;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fess=" + fess + "]";
	}
	
	

}
