package com.ibm.bankk;

public interface Banking {
	void summary();
	void statement();
	
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
}
