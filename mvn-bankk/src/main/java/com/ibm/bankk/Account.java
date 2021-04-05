package com.ibm.bankk;

public class Account {
	private double balance;
	
	public Account() {
		
	}
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double deposit(double amount) throws NumberFormatException {
		if (amount<0)
			throw new NumberFormatException("Negative Number");
		
		balance +=amount;
		return balance;
	}
	
	public double withdraw(double amount) throws BalanceException, NumberFormatException{
		if (amount<0)
			throw new NumberFormatException("Negative Number");
		
		if(amount>balance) {
			throw new BalanceException("insufficient Balance");
		}
		balance-=amount;
		return balance;
	}
	
}
