package com.wallet.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.wallet.app.entity.Wallet;

public class WalletDaoImpl implements WalletDao {
	
	
	private Connection con;
	
	public WalletDaoImpl() {
	 
		
	
		try {
	 	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee_details", "postgres","P@ssw0rd");
		System.out.println("Postgres connection successful !");
	} catch (SQLException e) {
	    
		e.printStackTrace();
	}
}
	
	
	

	@Override
	public Boolean addFundsToWallet(Wallet newwallet) throws SQLException {
		 
		return null;
	}

	@Override
	public Wallet getWallet(Integer walletId) {
		 
		return null;
	}

	@Override
	public Boolean updateWallet(Wallet updateWallet) {
		 
		return null;
	}

	@Override
	public Boolean deleteWallet(Integer walletId) {
		 
		return null;
	}

}
