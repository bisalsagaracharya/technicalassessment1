package com.BankingManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingManagementSystem.entity.Account;
import com.BankingManagementSystem.exception.AccountNotExitException;
import com.BankingManagementSystem.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepo;

	@Override
	public Account addNewAccount(Account account) {
		
		  Account save = this.accountRepo.save(account);
		 
		  return save;
	}

 

	@Override
	public Account updateAccount(Account account) {
		 Account save = this.accountRepo.save(account);
		return save;
	}

	@Override
	public List<Account> getAllAccounts() {
		 List<Account> findAll = this.accountRepo.findAll();
		 return findAll;
	}



	@Override
	public Boolean deleteAccountById(Integer accountId) throws AccountNotExitException {
		Optional<Account> findById = this.accountRepo.findById(accountId);
		if(findById.isPresent()) {
			accountRepo.deleteById(accountId);
			return true;
			 
		}else {
			throw new AccountNotExitException("Account is not exit");
		}
		 
	}

}
