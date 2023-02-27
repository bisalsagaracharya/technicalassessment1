package com.Shopping.service;

import com.Shopping.dto.Category;
import com.Shopping.exception.CategoryException;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> getAllProductsOfCategory(Integer categoryId);
    Category addNewCategory(Category category);

    Category updateCategory(Category category);

    List<Category> getAllCategory();

    void deleteCategory(Integer categoryId) throws CategoryException;


    Category getAllProductsByCategoryName(String categoryType) throws CategoryException;
}
