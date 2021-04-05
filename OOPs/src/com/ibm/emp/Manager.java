package com.ibm.emp;

public class Manager extends Employee { //specialized or derived class
	private double incentives;

	public Manager() {
		super();
	}

	public Manager(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentuves: " + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+incentives;
	}
	
	
}
