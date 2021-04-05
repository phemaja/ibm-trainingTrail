package com.ibm.cust;

public class Customer {
	private int custId;
	private String custName;
	private double creditlimit;
	
	private static int autogen;
	
	static { // static initializer block, acts as a constructor
		//executes at the time of class loading
		
		System.out.println("Customer class ready");
		autogen = 1001;
		
	}
	
	public Customer() {
	}

	public Customer(String custName, double creditlimit) {
		this.custId = autogen++;
		this.custName = custName;
		this.creditlimit = creditlimit;
	}
	
	public void details() {
		System.out.println("Customer Id: "+ custId);
		System.out.println("Customer Name: "+ custName);
		System.out.println("Cust CreditLIMIT: "+ creditlimit);
	}

}