package com.class11;

import java.lang.reflect.Array;

public class PracticeTasks {

	public static void main(String[] args) {
		
		//first way
		
//		String [] cars = new String [6]; 
//		cars [0] = "Ford"; 
//		cars [1] = "Honda"; 
//		cars [2] = "Audi"; 
//		cars [3] = "BMW"; 
//		cars [4] = "Nissan"; 
//		cars [5] = "Toyota"; 
//		
//		for (int i=0; i<cars.length; i++) { 
//			
//			System.out.println(cars [i]);
		
//		//second way 
//		
//		String [] cars = {"Ford", "Honda", "Audi", "BMW", "Nissan", "Toyota"}; 
//	
//		for (int i=0; i< cars.length; i++); {
//			System.out.println(cars[i]); // need help on this...
//			
		
//		String [] countries = {"USA", "Russia", "Turkey", "Spain"}; 
//		
//		for (int i=0; i<countries.length; i++) {
//			
//			if (countries[i].equals("USA")) {
//			System.out.println("D.C.");
//			} else if (countries[i].equals("Russia")) {
//			System.out.println("Moscow");
//			} else if (countries[i].equals("Turkey")) {
//			System.out.println("Ankura");
//			} else if (countries[i].equals("Spain")) {
//			System.out.println("Madrid");            }
//				
//				
//			2nd task: create an array of integers and find the largest number
		
         int[] num = {10, 20, 30, 40, 50};
         
         int largest = num[0]; 
         
         for(int i=0; i<num.length; i++) {     //possible interview question!!! 
        	 
        	 if (num[i]>largest) {
        		 largest=num[i]; 
        	 }
         }
         System.out.println("The largest number is "+largest);
        
         
         
         
         
				
				
			
			
			
			
			
			
			
			
		}
		
		
		
	}
	
	

