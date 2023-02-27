package com.walletmongo.app.service;

import java.util.List;

import com.walletmongo.app.model.Wallet;

public interface WalletService {
	
	Wallet createWallet(Wallet wallet);
    Wallet getWalletById(String id);
    List<Wallet> getAllWallet();
    Wallet updateWallet(Wallet wallet);
    Wallet deleteWalletById(String id);

}
