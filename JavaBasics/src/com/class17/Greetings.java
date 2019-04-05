package com.class17;

public class Greetings {
	
	public static void main(String[] args) {
		
		Greetings obj = new Greetings();
		obj.hello();
		//how to find the largest number:
		obj.findLargest(20, 10);
        obj.findLargest(30, 31);
		
		int a=10;
		int b=20; 
		
		if (a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
		
	}
	
     void hello() { //method signature
	    System.out.println("Hello"); //method body
	    
}
	 
     void findLargest(int a, int b) { 
    	 
    	 if (a>b) {
    		 System.out.println("A is larger than B");
         }else {
        	 System.out.println("B is larger than A");
         }
    	 
    	 
     }

	
}
