package com.BankingManagementSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 

@Entity
public class Customer {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Account> account;
	
	public Customer() {
		super();
		 
	}
 
	public Customer(int customerId, String customerName, String customerAddress, List<Account> account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.account = account;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	

	public List<Account> getAccount() {
		return account;
	}


	public void setAccount(List<Account> account) {
		this.account = account;
	}

	
}
