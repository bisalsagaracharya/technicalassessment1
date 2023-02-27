package com.wallet.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wallet.app.entity.Wallet;

@Repository
public interface WalletJpqlRepository extends JpaRepository<Wallet,Integer> {

	@Query("SELECT wal FROM Wallet wal")
	List<Wallet> findAllWallet();	
	
	@Query("SELECT wal FROM Wallet wal WHERE wal.id=?1")
	Wallet findWalletById(Integer id);
	
	@Modifying
	@Query("UPDATE Wallet wal SET wal.name =:name WHERE wal.id=:id")
	void updateNameByID(@Param("id") Integer customerId, String name);
	
	
	List<Wallet> findByBalanceBetween(Double balanceFrom, Double balanceTo);

	List<Wallet> findByNameLike(String name);
	List<Wallet> findByNameContaining(String name);
	
	
}
