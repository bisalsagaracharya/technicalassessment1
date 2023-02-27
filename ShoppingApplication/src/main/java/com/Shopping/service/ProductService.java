package com.Shopping.service;

import com.Shopping.dto.Product;
import com.Shopping.exception.CategoryException;
import com.Shopping.exception.ProductException;

import java.util.List;

public interface ProductService {

    Product addNewProduct(Product product);

    List<Product> getAllProducts();

    Product updateProduct(Product product);

    void deleteById(Integer id) throws ProductException;

    Product findProduct(Integer id) throws CategoryException;

    Product findProductByName(String name) throws CategoryException;
}
