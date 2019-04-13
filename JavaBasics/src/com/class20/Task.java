package com.class20;

public class Task {

	public static void main(String[] args) {
		
		Task obj = new Task();
		String email=obj.createEmail("John", "Snow", "gmail");
		System.out.println(email); 
		
		email=obj.createEmail("Bob", "Snow", "outlook"); 
		System.out.println(email);
		
		
	}
	
	String createEmail(String name, String lastName, String emailType) {
		
		String email=name+lastName+"@"+emailType+".com";
	return email;
	
	
		// TODO Auto-generated method stub

	}}
	
	

