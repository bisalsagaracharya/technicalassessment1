package com.wallet.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.paymentwallet.app.entity.Wallet;
import com.wallet.app.entity.Wallet;

public interface WalletDao {
	Boolean addWallet(Wallet newWallet) throws SQLException;
	Wallet getWalletById(Integer walletId);
	Boolean updateWallet(Wallet updateWallet);
    
    Boolean deleteWallet(Integer walletId);
  
    Boolean updateWalletBalance(Integer walletId,Double walletBalance);

}
