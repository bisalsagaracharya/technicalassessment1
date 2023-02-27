package com.product.controller;

import com.product.entity.Product;
import com.product.exception.ProductException;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

public class ProductDriver {
  
	 // CRUD OPERATION
		public static void main(String[] args) {
			
	//CREATE
		ProductService productService = new ProductServiceImpl();
		try {
			Product  pro = productService.registerProduct(new Product(1,"prod 1",100.00));
		System.out.println("Product Created SuccessFully");
			System.out.println(pro);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		   try {//Update Product 
			productService.updateProduct(new Product(101,"emp 101",10100.00));
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		   try {// Read The Product BY ID
			Product productByID = productService.getProductByID(1);
			System.out.println(productByID);
			} catch (ProductException e) {
			e.printStackTrace();
		}
		   try {//Delete Product
			Product deleteProductById = productService.deleteProductById(1);
			System.out.println("Deleted"+" "+deleteProductById);
		} catch (ProductException e) {
			e.printStackTrace();
		}
		
		}
	
}
