package com.ibm.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
	
	private double cartTotal;
	private ArrayList<Product> items;
	
	
	private HashMap<String, Double> coupons;
	
	public ShoppingCart() {
		//items =  new Product[5];
		items = new ArrayList<Product>();
		coupons.put("HOLI200",(double) 200);
		coupons.put("WKND150",(double) 150);
		coupons.put("APRIL500",(double) 500);
			
	}
	
	public void addProdcut(Product p) throws OutOfTheStockException {
		items.add(p);
		cartTotal += p.getPrice();
	}
		
	public void checkout(String coupon) throws PaymentException, CouponException{
		if(items.size() == 0)
			System.out.println("your cart is empty!");
			//throw new PaymentException("your cart is empty!");
		else 
		{
			System.out.println("products in cart");
			for(Product p:items)
				System.out.println(p.getTitle()+":"+p.getPrice());
			System.out.println("Cart Total: "+ cartTotal);
		}
	}
	
		
}
