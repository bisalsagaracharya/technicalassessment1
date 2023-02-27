package com.Shopping.controller;

import com.Shopping.dto.Category;
import com.Shopping.exception.CategoryException;
import com.Shopping.repository.CategoryRepository;
import com.Shopping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @PostMapping("category")
    Category addNewCategory(@Valid  @RequestBody Category category){
        return  this.categoryService.addNewCategory(category);
    }
    @PutMapping("category")
    Category modifyCategory(@Valid @RequestBody Category category){
        return  this.categoryService.updateCategory(category);
    }

    @GetMapping("categories")
    List<Category> getAllCategories(){
        return this.categoryService.getAllCategory();
    }

    @DeleteMapping("category/{categoryId}")
    public  String deleteCategoryById(@PathVariable Integer categoryId) throws CategoryException {
        this.categoryService.deleteCategory(categoryId);
        return "Category got deleted successfully";
    }

    @GetMapping("products/category/{categoryId}")
    Optional<Category> getProductsByCategoryId(@PathVariable Integer categoryId ){
      return this.categoryService. getAllProductsOfCategory(categoryId);

    }
    @GetMapping("products/categorys/{categoryType}")
    Category getProductsByCategoryName(@PathVariable String categoryType ) throws CategoryException {
        return this.categoryService.getAllProductsByCategoryName(categoryType);

    }
}
