package com.ibm.bankk;

public abstract class Account {
	public int actNo;
	public String holder;
	public double balance;
	public double amount=0;
	private static int autogen=1001;
	
	protected Transaction[] txns;
	protected int idx;
	
	public Account(String holder, double balance) {
		this.actNo=autogen++;
		this.holder=holder;
		this.balance=balance;
		
		txns = new Transaction[10];
		txns[idx++]= new Transaction("OB",balance,balance);
	}
	
	public void summary() {
		System.out.println("holder: "+holder+"\tbalance: "+balance);
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		//summary();
		txns[idx++]= new Transaction("CR", amount, balance);
	}
	
	public abstract void withdraw(double amount) throws BalanceException;
	
	public void statement() {
		System.out.println("Statement for account no"+ actNo);
		for(int i=0;i<idx;i++)
			txns[i].print();
	}
	
}