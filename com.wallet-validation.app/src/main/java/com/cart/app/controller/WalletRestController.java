package com.cart.app.controller;

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

import com.cart.app.entity.Wallet;
import com.cart.app.service.WalletService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/wallet")
public class WalletRestController {
	
	@Autowired
	private WalletService walletService;
     
	@PostMapping("/")
	public Wallet addWallet(@Valid @RequestBody Wallet wallet) {
		Wallet addWallet = this.walletService.addWallet(wallet);
		return addWallet;
	}
	@GetMapping("/{id}")
	public Wallet getWalletById(@Valid @PathVariable ("id")Integer walletId) {
	  Wallet walletById = this.walletService.getWalletById(walletId);
	  return walletById;
	}
	@GetMapping("/all")
	public List<Wallet> getAllWallet(){
		List<Wallet> allWallet = this.walletService.getAllWallet();
		return allWallet;
	}
	@PutMapping("/update")
	public Wallet updateWallet(@Valid @RequestBody Wallet walletId) {
		Wallet updateWallet = this.walletService.updateWallet(walletId);
		return updateWallet;
	}
	@DeleteMapping("/delete")
	public Wallet deleteWalletById(@Valid @PathVariable ("id") Integer walletId) {
		Wallet deleteWalletById = this.walletService.deleteWalletById(walletId);
		return deleteWalletById;
	}
	@PostMapping("walletadd/{amount}")
	public Wallet addMoneyToWallet(@Valid @RequestBody Wallet wallet, @PathVariable("amount") Double amount) {
		this.walletService.addFundsToWallet(wallet, amount);
		return wallet;
	}
	@PutMapping("walletget/{amount}")
	public Wallet getMoneyToWallet(@Valid @RequestBody Wallet wallet, @PathVariable("amount") Double amount) {
		this.walletService.getFundsToWallet(wallet, amount);
		return wallet;
	}
}
