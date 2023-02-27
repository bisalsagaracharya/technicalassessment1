package com.BankingManagementSystem.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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
import com.BankingManagementSystem.exception.AccountNotExitException;
import com.BankingManagementSystem.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/saveAccount")
	public Account AddNewAccount(@RequestBody Account account) {

		return this.accountService.addNewAccount(account);

	}
 
	 @PutMapping("/updateAccount")
		public Account updateAccount(@RequestBody Account account) {
		 Account updatedAccount = this.accountService.updateAccount(account);
			return updatedAccount;
		}
	 
	 @GetMapping("/allAccount")
		public List<Account> getAllAccount(){
			List<Account> account= this.accountService.getAllAccounts();
			return account;
		}
 
	 @DeleteMapping("account/{accountId}")
		public String deleteAccount(@PathVariable("accountId") Integer accountId) throws AccountNotExitException {
			this.accountService.deleteAccountById(accountId);
			return"Sucessfully delete Movie With ID"+accountId;		
		}
}
