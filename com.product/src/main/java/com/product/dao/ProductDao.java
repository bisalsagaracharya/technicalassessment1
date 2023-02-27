package com.product.dao;

import java.sql.SQLException;
import java.util.List;

import com.product.entity.Product;

public interface ProductDao {
	
		Boolean addProduct(Product newProduct) throws SQLException;
		Product getProduct(Integer productId);
		Boolean updateProduct(Product updateProduct);
	    Boolean updateByName(Integer productId,String productName);
	    Boolean deleteProduct(Integer productId);
	    List<Product> getAllProduct();
	    Boolean updateProductPrice(Integer productId,Double productPrice);
	}
