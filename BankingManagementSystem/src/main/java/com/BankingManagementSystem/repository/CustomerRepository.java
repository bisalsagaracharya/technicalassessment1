package com.BankingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingManagementSystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
