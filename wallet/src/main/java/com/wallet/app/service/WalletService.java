package com.wallet.app.service;

import java.util.List;

import com.wallet.app.entity.Wallet;

 public interface WalletService {
	
	Wallet createWallet(Wallet wallet);
    Wallet getWalletById(Integer id);
    List<Wallet> getAllWallet();
    Wallet updateWallet(Wallet wallet);
    Wallet deleteWalletById(Integer id);
    
}
