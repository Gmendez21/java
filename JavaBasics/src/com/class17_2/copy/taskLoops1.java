package com.class17_2.copy;

import java.util.Scanner;

public class taskLoops1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String item;

		double price=0;

		double amount;

		double difference = price;

		System.out.println("Please enter the item you want to buy");

		item = scan.next();
		
		System.out.println("Please enter the item price");
		
		price=scan.nextDouble();

              
		do {
		
			
			System.out.println("Enter payment");

			amount = scan.nextDouble();

			difference = difference - amount;
			
			System.out.println(" Your balence is " + difference);

		} while (difference > 0);

		System.out.println("Thank you for shopping");

		{

		}
	}
}
