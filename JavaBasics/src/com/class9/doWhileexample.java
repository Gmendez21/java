package com.class9;

import java.util.Scanner;

public class doWhileexample {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String item;

		double price = 50.00;

		double amount;

		double difference;

		System.out.println("Please enter the item you want to pay for");

		item = scan.next();

		System.out.println("Enter the amount of the item");

		amount = scan.nextDouble();

		difference = price - amount;

		while (difference > 0) {
			System.out.println("Enter payment");

			price = scan.nextDouble();

			difference = difference - amount;

		}

		System.out.println("You have paid it all Thank you");

		{

			

	

		
		}
	}
}



