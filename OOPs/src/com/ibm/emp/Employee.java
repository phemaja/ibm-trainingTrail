package com.ibm.emp;

public class Employee {  //Generalised class
	private int empId;
	private String empName;
	private double salary;
	
	private static int autogen;
	
	static { // static initializer block, acts as a constructor
		//executes at the time of class loading
		
		System.out.println("Employee class ready");
		autogen = 1001;
		
	}
	public Employee() {
		
	}
	public Employee(String empName, double salary) {
		this.empId = autogen++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		System.out.println("Employee Id: "+ empId);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Salary: "+ salary);
	}
	public double getSalary() {
		return salary;
	}

}
