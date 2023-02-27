package com.BankingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingManagementSystem.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
