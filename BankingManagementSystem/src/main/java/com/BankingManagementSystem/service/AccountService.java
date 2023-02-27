package com.BankingManagementSystem.service;

import java.util.List;

import com.BankingManagementSystem.entity.Account;
import com.BankingManagementSystem.exception.AccountNotExitException;

public interface AccountService {
	
	Account addNewAccount(Account account);
	Boolean deleteAccountById(Integer accountId) throws AccountNotExitException;
	Account updateAccount(Account account);
	List<Account> getAllAccounts();

}
