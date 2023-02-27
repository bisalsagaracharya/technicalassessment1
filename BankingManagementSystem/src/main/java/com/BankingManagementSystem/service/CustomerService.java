package com.BankingManagementSystem.service;

import java.util.List;

import com.BankingManagementSystem.entity.Customer;
import com.BankingManagementSystem.exception.CustomerNotExitException;

public interface CustomerService {
	
	Customer addNewCustomer(Customer customer);
	Boolean deleCustomerById(Integer customerId) throws CustomerNotExitException;
	Customer updateCustomer(Customer customer);
	List<Customer> getAllCustomer();

}
