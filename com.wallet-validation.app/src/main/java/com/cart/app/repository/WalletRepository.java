package com.cart.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.app.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {

}
