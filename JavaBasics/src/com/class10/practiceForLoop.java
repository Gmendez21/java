package com.class10;

public class practiceForLoop {

	public static void main(String[] args) {
		
		//* Print the following pattern
//		1
//		12
//		123
//		1234
//		12345
		
		for (int i=1; i<=5; i++) {
			for (int k = 1; k<=i; k++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
	
		
	}
	
}