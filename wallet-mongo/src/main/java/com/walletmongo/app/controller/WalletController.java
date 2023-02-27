package com.walletmongo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
import org.springframework.web.bind.annotation.RestController;

 
import com.walletmongo.app.model.Wallet;
 
import com.walletmongo.app.service.WalletService;

@RestController
//@RequestMapping("wallet")
public class WalletController {
	
	/*@Autowired
	private WalletRepository walletRepository;
     
	@PostMapping("/")
	 public ResponseEntity<?> addWallet(@RequestBody Wallet wallet){
		 Wallet save = this.walletRepository.save(wallet);
		 return ResponseEntity.ok(save);
	 }
	
	@GetMapping("/")
	public ResponseEntity <?> getWallet (){
		 return ResponseEntity.ok(this.walletRepository.findAll());		 
	}
	@PutMapping("/")
	public ResponseEntity<?> updateWallet(@RequestBody Wallet wallet){
		  Wallet save = this.walletRepository.save(wallet) ;
	     return ResponseEntity.ok(wallet);
	}*/
	
	//new method
	
	/*public String saveWallet(@RequestBody Wallet wallet) {
		this.walletRepository.save(wallet);
		return "Added wallet with id :"+wallet.getId();
	}*/
	
	@Autowired
	private WalletService walletService;
	
	@PostMapping("wallet")
	public Wallet createWallet(@RequestBody  Wallet wallet) {
		return this.walletService.createWallet(wallet);
		 
	}
	
	@GetMapping("wallet/{id}")
	public Wallet getWalletById(@PathVariable ("id") String id) {
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
	public Wallet deleteWalletById(@PathVariable ("id")  String id) {
		return this.walletService.deleteWalletById(id);
	}
	
	
}
