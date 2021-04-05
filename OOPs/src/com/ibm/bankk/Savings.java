package com.ibm.bankk;

public class Savings extends Account implements Banking{

	public Savings(String holder) {
		super(holder, 10000);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount<=(balance-1000)) {
			balance-=amount;
			txns[idx++]=new Transaction("DR",amount,balance);
		}
		else
			//System.out.println("Insufficient");
			throw new BalanceException("Insufficient balance");
	}
	
}
