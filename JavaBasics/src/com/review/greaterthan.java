package com.review;

import java.util.Scanner;

public class greaterthan {
	
	public static void main(String[] args) {
		
		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear winter clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		
//		do this later^^^ 
		
		//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
        // If the age is greater than 100 print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		
		int age;
		Scanner scan =new Scanner(System.in);
		System.out.println("How old are you?");
		age=scan.nextInt();
		
		if (age >= 100) {
		System.out.println("You are too old");
		
	}else if (age > 36 || age <= 99) {
		System.out.println("You are a middle age person");}
		
    else if (age >18 && age <35) {
    	System.out.println("Young person");}
		
    else {
    	
    }(!(age <=18))
    	System.out.println("Too young"); 
    	
    	
    }
	}
    
    	
			
		
	
		
		
		
		
		
	
		
	
	

}
