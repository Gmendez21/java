package com.class35;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please put in the integer");
		
		try { 
			int num=sc.nextInt(); 
		}catch (InputMismatchException t) { 
			System.out.println("Please, enter only integer value");
		}
		
	}
	}


