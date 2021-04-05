package com.ibm.stream;

public class User {
	private String name;
	protected int age;
	private String gender;
	private double balance;
	private Subscription subscription;
	
	public User() {
		
	}

	public User(String name, int age, String gender, double balance) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}
	
	public void profile() {
		System.out.println("Name "+ name);
		System.out.println("Age "+ age);
		System.out.println("Gender "+ gender);
	}

	public void subscription() {
		System.out.println("subscription: " + (subscription ==null?"not sub":subscription.getPlan()));
		
		
//		if(subscription!=null) {
//			System.out.println("Plan: "+subscription.getPlan());
//			System.out.println("Expiry: "+subscription.getExpiry());
//		} else
//			System.out.println("Not subscribed for any plan!");
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public Subscription getSubscription() {
		return subscription;
	}
	
	public void setSubscription(Subscription subscription) {
		this.subscription=subscription;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
