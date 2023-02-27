package com.Shopping.service;

import com.Shopping.dto.Product;
import com.Shopping.exception.CategoryException;
import com.Shopping.exception.ProductException;
import com.Shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addNewProduct(Product product) {
        return this.productRepository.save(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void deleteById(Integer id) throws ProductException {
    Optional<Product> product =this.productRepository.findById(id);
    if(product.isEmpty()){
        throw new ProductException("Product for Id not available");
    }else
            this.productRepository.deleteById(id);
    }

    @Override
    public Product findProduct(Integer id) throws CategoryException {

        Optional<Product> findById = this.productRepository.findById(id);
        if (findById.isEmpty()) {
            throw new CategoryException("Product not found");
        } else {
            return findById.get();
        }
    }

    @Override
    public Product findProductByName(String name) throws CategoryException {
        Optional<Product> findByName = this.productRepository.findByName(name);
        if (findByName.isEmpty()) {
            throw new CategoryException("Product not found");
        } else {
            return findByName.get();
        }
    }
}
