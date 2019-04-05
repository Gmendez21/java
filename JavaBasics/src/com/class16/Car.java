package com.class16;

public class Car {
	
	String make, model, color; 
	int door, wheels; 
	
	public static void main(String[] args) {
		
		//ClassName variableName = new ClassName();
		
		//1st object:
		
		Car car1= new Car(); 
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black"; 
		car1.door=4; 
		car1.wheels=4;
		
		//2nd object:
		
		Car car2=new Car(); 
		car2.make="Tesla";
		car2.model = "x";
		car2.color = "Blue";
		car2.wheels = 4; 
		car2.door = 4; 
		
		System.out.println("My car is "+car2.color );
	
		
		
		
		
		
		
		
	}

}
