package com.ibm.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {
	private String plan;
	private LocalDate expiry;
	private User user;
	
	public Subscription() {
	
	}
	
	public void subscription(String plan, User user) throws SubscriptionException {
		if(plan.equalsIgnoreCase("Montly")&& user.getBalance()>=100) {
			user.setBalance(user.getBalance()-100);
			user.setSubscription(this);
			expiry=LocalDate.now().plus(1, ChronoUnit.MONTHS);
			this.plan=plan;
		}
		else if(plan.equalsIgnoreCase("Annually")&& user.getBalance()>=1000) {
			user.setBalance(user.getBalance()-1000);
			user.setSubscription(this);
			expiry=LocalDate.now().plus(1, ChronoUnit.YEARS);
			this.plan=plan;
		}
		else
			throw new SubscriptionException("Insufficientbalance against subscription amount");
	}
	
	public String getPlan() {
		return plan;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	
	
}
/*

public class Subscription {
	
	
	public LocalDate expiry;
	private String paln;
	public void subscribe(String paln,User user) throws SubscriptionException {
	
		if(paln.equalsIgnoreCase("Montly") && user.getBalance()>=100) {
			
			user.setBalance(user.getBalance()-100);
			user.setSubscription(this);
			expiry=LocalDate.now().plus(1,ChronoUnit.MONTHS);
			this.paln=paln;
	    }
		else if(paln.equalsIgnoreCase("annualy") && user.getBalance()>=1000) {
			user.setBalance(user.getBalance()-1000);
			user.setSubscription(this);;
			expiry=LocalDate.now().plus(1,ChronoUnit.YEARS);
			this.paln=paln;
		}
		else
			throw new SubscriptionException("Insufficient balance aganist subscription amount");
		
	}
	public String getPlan() {
		return paln;
	}
	
	public LocalDate getExipry() {
		return expiry;
	}
}
*/