package com.walletmongo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walletmongo.app.model.Wallet;
import com.walletmongo.app.repo.WalletRepository;

@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletRepository walletRepository;

	@Override
	public Wallet createWallet(Wallet wallet) {
		this.walletRepository.save(wallet);
		 
		return null;
	}

	@Override
	public Wallet getWalletById(String id) {
		
		Optional<Wallet> optWallet = this.walletRepository.findById(id);
		
		if(optWallet.isPresent())
			return optWallet.get();
		 
		return null;
	}

	@Override
	public List<Wallet> getAllWallet() {
		return this.walletRepository.findAll();
		 
	}

	@Override
	public Wallet updateWallet(Wallet updateWallet) {
		return this.walletRepository.save(updateWallet);
		 
	}

	@Override
	public Wallet deleteWalletById(String id) {
		  Optional<Wallet> optDelete= this.walletRepository.findById(id);
	      if(optDelete.isEmpty())
	    	  return null;
	      this.walletRepository.deleteById(id);
	      return optDelete.get();
	      }
 

	 

}
