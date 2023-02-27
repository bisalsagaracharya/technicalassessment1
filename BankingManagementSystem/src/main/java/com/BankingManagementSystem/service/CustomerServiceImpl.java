package com.BankingManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingManagementSystem.entity.Customer;
import com.BankingManagementSystem.exception.CustomerNotExitException;
import com.BankingManagementSystem.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer addNewCustomer(Customer customer) {
		
		
		 Customer save = this.customerRepo.save(customer);
		return save;
	}

	@Override
	public Boolean deleCustomerById(Integer customerId) throws CustomerNotExitException {
		   Optional<Customer> findById = this.customerRepo.findById(customerId);
		   if(findById.isPresent()) {
			   customerRepo.deleteById(customerId);
			   return true;
		   }else {
			throw new CustomerNotExitException("Customer not exit");
		}
		 
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	      Customer save = this.customerRepo.save(customer);
		return save;
	}

	@Override
	public List<Customer> getAllCustomer() {
		 List<Customer> findAll = this.customerRepo.findAll();
		return findAll;
	}

}
