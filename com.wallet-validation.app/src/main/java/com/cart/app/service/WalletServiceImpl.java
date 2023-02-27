package com.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.app.entity.Wallet;
import com.cart.app.repository.WalletRepository;

@Service
public class WalletServiceImpl implements WalletService {
	
	@Autowired
	private WalletRepository walletRepo;

	@Override
	public Wallet addWallet(Wallet Wallet) {
		  return this.walletRepo.save(Wallet);
	 
	}
	
	@Override
	public Wallet getWalletById(Integer walletid) {
		 
		Optional<Wallet> optFind = this.walletRepo.findById(walletid);
		 if(optFind.isPresent())
		 return optFind.get();
		return null;
	}

	@Override
	public List<Wallet> getAllWallet() {
		return this.walletRepo.findAll();
	}

	@Override
	public Wallet updateWallet(Wallet updateWallet) {
		 Wallet save = this.walletRepo.save(updateWallet);
		 return save;
	}

	@Override
	public Wallet deleteWalletById(Integer walletId) {
		Optional<Wallet> optDelete = this.walletRepo.findById(walletId);
		if(optDelete.isEmpty())
			 return null;
		this.walletRepo.deleteById(walletId);
		return optDelete.get();
	}


	@Override
	public Wallet addFundsToWallet(Wallet wallet, Double amount) {
		wallet.setSalary(wallet.getSalary()+ amount);
		this.walletRepo.save(wallet);
		return wallet;
	}


	@Override
	public Wallet getFundsToWallet(Wallet wallet, Double amount) {
		wallet.setSalary(wallet.getSalary() - amount);
		this.walletRepo.save(wallet);
		return wallet;
	}

}
