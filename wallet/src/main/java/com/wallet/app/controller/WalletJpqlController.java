package com.wallet.app.controller;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.app.dao.WalletJpqlRepository;
import com.wallet.app.entity.Wallet;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("jpql")
public class WalletJpqlController {
  
	@Autowired
	private WalletJpqlRepository walletRepository;
	
	@GetMapping("wallets")
	public List<Wallet> getAllWallet(){
		
		return this.walletRepository.findAllWallet();
		
	}
	@GetMapping("wallet/{id}")
	public Wallet getWalletById(@PathVariable("id") Integer id){
		
		return this.walletRepository.findWalletById(id);
		
	}
	
	@PatchMapping("wallet/{id}/{name}")
	@Transactional
	public String updateCustomerNameById(@PathVariable("id") Integer id,@PathVariable("name") String name) {
		
	    this.walletRepository.updateNameByID(id, name);
		return "Customer Name Updated";
	}
	
	@GetMapping("wallet/{from}/{to}")
	@Transactional
	public List<Wallet> getWalletBetweenBalance(@PathVariable Double from,@PathVariable Double to){
		return this.walletRepository.findByBalanceBetween(from, to);
	}
	
	@GetMapping("wallet/name/{name}")
	public List<Wallet> getWalletBetweenBalance(@PathVariable String name){
		return this.walletRepository.findByNameLike(name);
	}
	
}
