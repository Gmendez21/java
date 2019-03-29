package com.class12;

import java.util.Scanner;

public class PasswordAndUserTask {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	String Username;
	String Password;
	String ConfirmedPassword; 
	
	
	System.out.println("Please enter your username");
	Username = scan.nextLine(); 
	
	System.out.println("Please enter your password");
	Username = scan.nextLine(); 
	
	System.out.println("Please confirm your password");
	ConfirmedPassword = scan.nextLine();
	
	
	if (Password==ConfirmedPassword) 
		
		if (Password.length()>8) {
			
			if (!Password.equals(ConfirmedPassword)); {
				message="Your username and password has been created";
				
				else 
					
					//look at slack for the rest
				
				
			}
			
			
		}
		
	}else {
		message="Username and Password cannot be empty";
	
	
	
			

	}
	

}
