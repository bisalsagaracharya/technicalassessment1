package com.train.ticket.app.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;

public class Passenger {
    
	@Id
	private String id;
	@NotBlank(message = " name can't be blank.")
	@NotNull(message = " name can't be null.")
	@Pattern(regexp="[A-Za-z]{3,30}", message= "name must be alphabets having min 3 to max 30 chars.")
	private String name;
	@Min(5)
	@Max(100)
	private int age;
	@NotEmpty(message = "Gender Not Be Empty")
	private char gender;

	public Passenger() {
		super();
	}
	public Passenger(String id,String name, int age, char gender) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
