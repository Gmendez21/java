package com.class16;

public class Phone {
	
	int size; 
	String color, brand; 
	boolean touchscreen; 
	
	public static void main(String[] args) {
		
		Phone ph1 = new Phone();
		
		ph1.brand="iPhone";
		ph1.color="black";
		ph1.size=13; 
		ph1.touchscreen=true; 
		
		ph1.callPeople();
		ph1.textPeople();
		
		
		
		
		
	}
	
void callPeople() {
	System.out.println("We can call people with "+brand);
}
void textPeople() {
	System.out.println("We can text people with "+brand);
}
	
}
