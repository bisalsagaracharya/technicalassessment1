package com.cart.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="validation")
public class Wallet {
   
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank(message = "Employee name can't be blank.")
	//@Size(min=3, max=30, message = "Name must be at least 3 and max 30 chars")
	@NotNull(message = "Wallet name can't be null.")
	@Pattern(regexp="[A-Za-z]{3,30}", message= "Name must be alphabets having min 3 to max 30 chars.")
	private String name;
	@Min(value = 0,message = "Salary must be greater than 0.")
	@NotNull(message = "Salary name can't be null.")
	private Double salary;
	public Wallet() {
		super();
		 
	}
	public Wallet(Integer id, @NotBlank(message = "Employee name can't be blank.") String name, @NotNull(message = "Salary name can't be null.")
			@Min(value = 0, message = "Salary must be greater than 0.") Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
    
	 
	
}
