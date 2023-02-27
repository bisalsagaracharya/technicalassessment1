package com.Shopping.repository;

import com.Shopping.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("Select pro from Product where pro.name=?1")
    @Query("SELECT pro FROM Product pro WHERE pro.name = ?1")

    Optional<Product> findByName(String name);
}
