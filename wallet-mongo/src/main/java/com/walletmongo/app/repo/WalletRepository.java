package com.walletmongo.app.repo;

 

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.walletmongo.app.model.Wallet;

@Repository
public interface WalletRepository extends MongoRepository<Wallet,String> {

 
 
}
