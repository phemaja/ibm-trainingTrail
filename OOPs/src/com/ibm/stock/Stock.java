package com.ibm.stock;

public class Stock implements Exchange {
	public double market;

	@Override
	public void gets() {
		System.out.println("get quote");
		
	}

	@Override
	public void view() {
		System.out.println("view quote");
	}

	@Override
	public void set() {
		System.out.println("set quote");
	}
	
	
	
}
