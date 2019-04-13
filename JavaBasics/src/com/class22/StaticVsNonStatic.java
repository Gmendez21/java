package com.class22;

public class StaticVsNonStatic {
		
		public static String name="John";
		
		public static String lastName= "Snow"; 
		
		public static void main(String[] args) { 
			
			StaticVsNonStatic obj=new StaticVsNonStatic();
			obj.getInfo();
			
		}
		
		//non static method 
		public void getInfo() { 
			System.out.println("My name is "+name+" and my last name is "+lastName);
		}
		
		//static method
		public static void getInfo1() { 
			//System.out.println("My name is "+name+" and my last name is "+lastName);
			//will get an error
			System.out.println("I am a static method");
		}
		
	}
