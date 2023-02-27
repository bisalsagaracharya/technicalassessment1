package com.Shopping.controller;

import com.Shopping.dto.Product;
import com.Shopping.exception.CategoryException;
import com.Shopping.exception.ProductException;
import com.Shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService shoppingService;
   
    @PostMapping("product")
    public Product addNewProduct(@Valid @RequestBody Product product){
        Product product1 =shoppingService.addNewProduct(product);
        return product1;
    }
    @GetMapping("products")
    public List<Product> getListOfProducts(){
        return this.shoppingService.getAllProducts();
    }

    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable("id") Integer id) throws ProductException, CategoryException {
        return this.shoppingService.findProduct(id);
    }

    @PutMapping("product/{product}")
    public Product updateProduct(@Valid @RequestBody Product product) {
        return this.shoppingService.updateProduct(product);
    }

    @DeleteMapping("product/{id}")
    public String deleteProductByName(@PathVariable("id") Integer id) throws ProductException {
        this.shoppingService.deleteById(id);
        return "Product got deleted successfully";
    }
    @GetMapping("productname/{name}")
    public Product getProductByName(@PathVariable("name") String name) throws ProductException, CategoryException {
        return this.shoppingService.findProductByName(name);
    }

}
