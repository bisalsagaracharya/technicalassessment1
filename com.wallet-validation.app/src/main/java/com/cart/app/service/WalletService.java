 package com.cart.app.service;

import java.util.List;

import com.cart.app.entity.Wallet;

public interface WalletService {
	
	Wallet addWallet(Wallet Wallet);
	Wallet getWalletById(Integer walletid);
	List<Wallet> getAllWallet();
	Wallet updateWallet(Wallet updateWallet);
	Wallet deleteWalletById(Integer walletId);
    
	Wallet addFundsToWallet(Wallet wallet, Double salary);
	Wallet getFundsToWallet(Wallet wallet, Double salary);
}
