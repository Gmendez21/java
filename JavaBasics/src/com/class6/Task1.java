package com.class6;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
//	write a program that prints out if it is good weather to go for a activity
//	if the temperature is between 40 degrees and 80 degrees and rain, we will go hiking
//	otherwise we wont go hiking

//	if temperature is between 25 and 40 degrees and snowing, we will go snow boarding
//	otherwise we do not go snowboarding 
		
//  if temperature is more than 80 and sunny, we go to the beach
//  otherwise we dont go to the beach
		
		boolean snow, sunny, rain;
		int temp;
		String activity; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the temperature?");
		
		temp = scan.nextInt();
		
		if (temp>=40 && temp<=80) {
		System.out.println("is it raining?");
			rain=scan.nextBoolean();
			
		if(rain) {
				activity = "watch a movie"
			}
			
		} else if {
			System.out.println("we won't go hiking");
		}
		
		else if (temp >=25 && temp <=40);
		
		
		
		
		
		
	}

}
