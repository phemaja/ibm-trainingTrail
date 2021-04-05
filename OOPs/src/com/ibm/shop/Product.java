package com.ibm.shop;
public class Product {
	private String title;
	private double price;
	private String cart;
	private int stock;
	
	
	public Product() {
		
	}
	
	public Product(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
}

