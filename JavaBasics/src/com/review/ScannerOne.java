package com.review;

import java.util.Scanner;

public class ScannerOne{
	
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("What is your gender?");
		String gender = scan.nextLine();
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("What is your phone number?");
		long number = scan.nextLong();
		
		
	}

}
