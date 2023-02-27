package com.Shopping.service;

import com.Shopping.dto.Category;
import com.Shopping.dto.Product;
import com.Shopping.exception.CategoryException;
import com.Shopping.repository.CategoryRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements  CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    Log log = LogFactory.getLog(CategoryServiceImpl.class);


    @Override
    public Optional<Category> getAllProductsOfCategory(Integer categoryId) {

        return this.categoryRepository.findById(categoryId);
    }

    @Override
    public Category addNewCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return this.categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Integer categoryId) throws CategoryException {
        Optional<Category> findById = this.categoryRepository.findById(categoryId);
        if (findById.isEmpty()) {
            throw new CategoryException("***************");

        }
            this.categoryRepository.deleteById(categoryId);

    }

    @Override
    public Category getAllProductsByCategoryName(String categoryType) throws CategoryException {
        Optional<Category> findById = this.categoryRepository.findByCategoryName(categoryType);
        if (findById.isEmpty()) {
            throw new CategoryException("Category By Name not found");
        } else {
            return findById.get();
        }
    }

}
