package com.review;

public class arrays {
	
	public static void main(String[] args) {
		
//		Write a program that prints the following pattern
//		
//		Output: 
//			
//			1 2 3 4 5 6 7 8 9 10
//		    2 4 6 8 10 12 14 16 18 20 
//		    3 6 9 12 15 18 21 24 27 30 
//		    4 8 12 16 20 24 28 32 36 40 
//		    5 10 15 20 25 30 35 40 45 50 
		
		
//	   Write a program that prints the following pattern 
//
//     ....1
//	   ...22	
//	   ..333	
//	   .4444
//	   55555
//		
//		I DONT UNDERSTAND THIS! ! ! 

		
		
//		 for(int i =1; i<=5; i++) {           
//	     for(int k = 1; k<=(5-i); k++) {       
//				 System.out.print(".");   }          
//	     for(int l = 1; l<=i; l++) {                         
//				 System.out.print(i);            }                
//			 System.out.println();                    }
//		
		
//		int i = 0; 
//		int j = 1; 
//		int k = 4; 
//		
//		int [] arr = new int [3]; 
//		System.out.println( );
//		HUH???? 
		
//		Write a program to sum the values of an array
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10}; 
		int [] numbers1 = new int[10]; 
		
		int sum = 0; 
		
		for (int i =0; i < numbers.length; i++) { 
			sum = sum + numbers[i];
		}
		
		System.out.println("The sum of all array elements = " + sum);
		
		
		
	}}