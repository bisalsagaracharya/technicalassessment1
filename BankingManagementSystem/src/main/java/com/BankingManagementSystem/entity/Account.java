package com.BankingManagementSystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account{
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int accountId;
	private String accountName;
	private int accountNumber;
	
	public Account() {
		super();
		
	}


	public Account(int accountId, String accountName, int accountNumber ) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	 
	}



	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
