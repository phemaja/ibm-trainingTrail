package com.ibm.bankk;

public class Current extends Account implements Banking {
	private double overdraft;
	
	public Current(String holder) {
		super(holder, 5000);
		this.overdraft=10000;
	}
	
	public void summary() {
		super.summary();
		System.out.print("overdraft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft+=amount;
		if(overdraft>10000) {
			balance+=overdraft-10000;
			overdraft=10000;
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount<=(balance+overdraft)) {
			balance-=amount;
			if(balance<0) {
				overdraft+=balance;
				balance=0;
			}
		}
		else
			throw new BalanceException("Insufficient balance");
	}
	
}
