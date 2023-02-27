package com.wallet.app.controller;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.app.entity.Wallet;
import com.wallet.app.service.WalletService;

import java.util.*;
@RestController
public class WalletController {
	
	@Autowired
	private WalletService walletService;
	
	@PostMapping("wallet")
	public Wallet createWallet(@RequestBody  Wallet wallet) {
		return this.walletService.createWallet(wallet);
		 
	}
	
	@GetMapping("wallet/{id}")
	public Wallet getWalletById(@PathVariable ("id") Integer id) {
		return this.walletService.getWalletById(id);
		 
	}
	
	@GetMapping("wallet")
	public List<Wallet> getAllWallet (){
	  return this.walletService.getAllWallet();
		 
	}
	@PutMapping("wallet")
	public Wallet updateWallet(@RequestBody Wallet updateWallet) {
		return this.walletService.updateWallet(updateWallet);
	}
	@DeleteMapping("wallet/{id}")
	public Wallet deleteWalletById(@PathVariable ("id")  Integer id) {
		return this.walletService.deleteWalletById(id);
	}
		 
	}


