package com.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		lets create an array of names that will hold 5 elements and retrieve all values from it 
//		
//		String [] names = new String[5]; //store the amount of arrays you want, then list: 
//		
//		names [0]="Asel"; 
//		names [1]="Awet"; 
//		names [2]="Arif"; 
//		names [3]="Waqas"; 
//		names [4]="Dmitri"; 
//		
//		for (int i=0; i<=4; i++) { 
//			
//			System.out.println(names[i]); //what is names.length??? ask later
//		}
//		

//		2. create an array using array literal
		
//		String[] studentNames = {"Bob", "Bill", "Zack", "Alan", "Susan", "Frank"};
//		
//		for (int i=0; i<studentNames.length; i++) {//why -1??? answer: only if <=, just = better
//			System.out.println(studentNames[i]);
//			
//			}
//		
//		// retrieve values using: advanced for loop, for each loop, enhanced for loop
//		
//		for (String student: studentNames) {
//			System.out.println(student);
//		}
		
		int [][] arr= {
				{1,2,3},
				{10, 20, 30}, 
				{100, 200, 300}
		};
		
		for(int i=0; i<arr.length;i++) { 
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
			}
		        System.out.println();
		
		}
		
		System.out.println("-----------For each Loop--------------------");
		
		for (int[] singleArray:arr) {
			for (int numbers:singleArray)
			{System.out.print(numbers+" ");
		}
		  }        System.out.println();        }
		
		
	}


