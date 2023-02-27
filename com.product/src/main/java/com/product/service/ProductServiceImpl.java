package com.product.service;

import java.sql.SQLException;

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.entity.Product;
import com.product.exception.ProductException;

public class ProductServiceImpl implements ProductService{
	
		private ProductDao productRespository = new ProductDaoImpl();
		
		public ProductServiceImpl() {
			super();
		}

		@Override
		public Product registerProduct(Product product) throws ProductException {
			try {
				this.productRespository.addProduct(product);
			} catch (SQLException e) {
				throw new ProductException("Product Could Not be  added"+e.getMessage());
			}
			
			return this.productRespository.getProduct(product.getProductId());
		}

		@Override
		public Product getProductByID(Integer id) throws ProductException {
			Product foundProduct = this.productRespository.getProduct(id);
			if(foundProduct ==null)
				throw new ProductException("Product not found");
			
			
			return foundProduct;
		}

		@Override
		public Product updateProduct(Product updateProduct) throws ProductException {
			Product pro = this.productRespository.getProduct(updateProduct.getProductId());
			if(pro==null)
				throw new ProductException("Product not found to update");
			this.productRespository.updateProduct(updateProduct);
			
			
			return this.productRespository.getProduct(updateProduct.getProductId());
		}

		@Override
		public Product deleteProductById(Integer id) throws ProductException {
			Product foundPro = productRespository.getProduct(id);
			if(foundPro==null)
				throw new ProductException("Product ID Not Found To Delete");
			productRespository.deleteProduct(id);
			productRespository.deleteProduct(id);
			return foundPro;
		}
		 

	}