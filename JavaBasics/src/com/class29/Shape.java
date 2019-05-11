package com.class29;

public interface Shape {
	
	void calculateArea();
	void calculatePerimeter();
	
}

class Circle implements Shape {
	
	@Override    
	
	public void calculateArea() {
		
		int a=10;
		double area=3.14*a*2;
		
		System.out.println("The area of a circle is "+area);
		}    
	
	@Override    
	
	public void calculatePerimeter() {
		
		int a=10;
		double perimeter=2*3.14*a;
		System.out.println("The perimeter of a circle is "+perimeter);
		}}   

class Square implements Shape {   

	@Override    
	
	public void calculateArea() {
		
		int l=10; 
		int h=10;        
		int area=l*h;
		
		System.out.println("The area of a square is "+area);    
		}    
	
	@Override   
	
	public void calculatePerimeter() {
		
		int l=10;
		int perimeter=l*10;
		
		System.out.println("The perimeter of a square is "+perimeter);    }
	}