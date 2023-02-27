package com.Shopping.repository;

import com.Shopping.dto.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT cat FROM Category cat WHERE cat.categoryType = ?1")
    Optional<Category> findByCategoryName(String categoryType);

}
