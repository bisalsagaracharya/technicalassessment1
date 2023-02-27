package com.product.service;

import com.product.entity.Product;
import com.product.exception.ProductException;

public interface ProductService {
    
		Product registerProduct(Product product)throws ProductException;
		Product getProductByID(Integer id)throws ProductException ;
		Product updateProduct(Product updateProduct)throws ProductException;
		Product deleteProductById(Integer id)throws ProductException;

	}

