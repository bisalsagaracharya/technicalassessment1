package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	

	@Override
	public Product addProduct(Product product) {
		return  this.productRepo.save(product);
		 	 
	}

	@Override
	public Product getProductById(Integer id) {
		 
      Optional<Product> findById = this.productRepo.findById(id);
      if(findById.isPresent()) {
    	  return findById.get(); 
      }
     return null;
	}

	@Override
	public List<Product> getAllProduct() {
		 List<Product> findAll = this.productRepo.findAll();
		return findAll;
	}


	@Override
	public Product updateProduct(Product updateProduct) {
		 Product update = this.productRepo.save(updateProduct);
		return update;
	}


	@Override
	public Product deleteProductById(Integer id) {
		Optional<Product> OptProduct = this.productRepo.findById(id);
		if(OptProduct.isEmpty()){
		  System.out.println("not delete");	
		}else {
			System.out.println("delete");
		}
		return OptProduct.get();
	 
	}

}
