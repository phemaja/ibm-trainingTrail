package com.ibm.cust;

public class LoyalCustomer extends Customer {
	private double discount;
	
	public LoyalCustomer() {
		// TODO Auto-generated constructor stub
	}

	public LoyalCustomer(String custName, double creditlimit, double discount) {
		super(custName, creditlimit);
		this.discount=discount;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		super.details();
		System.out.println("Discount: "+ discount);
		
	}

}
