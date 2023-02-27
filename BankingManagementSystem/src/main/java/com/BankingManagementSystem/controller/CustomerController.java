package com.BankingManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankingManagementSystem.entity.Account;
import com.BankingManagementSystem.entity.Customer;
import com.BankingManagementSystem.exception.AccountNotExitException;
import com.BankingManagementSystem.exception.CustomerNotExitException;
import com.BankingManagementSystem.service.CustomerService;


@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public Customer AddNewCustomer(@RequestBody Customer customer) {
		
		return this.customerService.addNewCustomer(customer);
			 
	}
	
	 @PutMapping("/updateCustomer")
		public Customer updateCustomer(@RequestBody Customer customer) {
		 Customer updatedCustomer = this.customerService.updateCustomer(customer);
			return updatedCustomer;
		}
	 
	 @GetMapping("/allCustomer")
		public List<Customer> getAllCustomer(){
			List<Customer> customer= this.customerService.getAllCustomer();
			return customer;
		}

	 @DeleteMapping("customer/{customerId}")
		public String deleteCustomer(@PathVariable("customerId") Integer customerId) throws CustomerNotExitException {
			this.customerService.deleCustomerById(customerId);
			return"Sucessfully delete Movie With ID"+customerId;		
		}

}
