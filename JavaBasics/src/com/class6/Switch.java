package com.class6;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
//		prompt user to enter thier country
//		based on the country, specify favorite food
		
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter which country you are from");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			food="Burger";
			break;
		case "Afghanistan":
			food="Palau";
			break;
		case "Russia":
			food="Pelmeni";
			break;
		case "Italy":
			food="Pasta";
			break;
		default:
			food="Unknown";
			
		}
		
		System.out.println("Your favorite food is "+food);
	}
}


