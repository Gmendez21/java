package com.class21;

public class Employee {

	String eID;
	int salary; 
	static String CEO; 
	
	Employee employ1 = new Employee(); 
	Employee employ2 = new Employee(); 
	
	public void main(String[] args) {
		
	employ1.eID = "Bob";
	employ1.salary = 100000;
	employ1.CEO = "Sumair"; 
	
	employ2.eID = "Rob"; 
	employ2.salary = 200000; 
	employ2.CEO = "Sumair"; 
	
	System.out.println(employ1.eID+ " makes "+ employ1.salary+ " and the CEO is "+CEO);
	System.out.println(employ2.eID+ " makes "+ employ2.salary+ " and the CEO is "+CEO);
	
		
		
		
	}
	
}
