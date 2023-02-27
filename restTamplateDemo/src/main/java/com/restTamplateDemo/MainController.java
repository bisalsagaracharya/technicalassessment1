package com.restTamplateDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("product")
	List<Product>getProductList(){
		return restTemplate.getForObject("http://localhost:8091/products",
		 List.class);
	}
}
