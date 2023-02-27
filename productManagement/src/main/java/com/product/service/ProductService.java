package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	Product getProductById(Integer id);
	List<Product> getAllProduct();
	Product updateProduct(Product updateProduct);
	Product deleteProductById(Integer id);
	
}
