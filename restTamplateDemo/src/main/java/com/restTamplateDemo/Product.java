package com.restTamplateDemo;

import java.time.LocalDate;

 public class Product {
	 
	private String id;
	private String name;
	private Integer quantity;
	private Double price;
	private LocalDate expiryDate;
	public Product() {
		super();
	}
	public Product(String id, String name, Integer quantity, Double price, LocalDate expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
}
