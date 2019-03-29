package com.class12;

public class StringManipulations2 {
	
	public static void main(String[] args) {
		
		String str="Good Morning, students!"; 
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		String present="Welcome, Mehmet";
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toLowerCase().contains(neededValue);
		System.out.println(flag1);
		
		System.out.println("_____StartWith & EndsWith_____");
		String str1="syntax"; 
		
		boolean starts=str1.startsWith("s");
		System.out.println("starts");
		
		System.out.println(str1.endsWith("X"));
		
		//
		
		System.out.println("_____isEmpty()_____");
		String str2=""; 
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("_____concat()_____");
		String str3="Hello";
		String str4="Ali!"; 
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		System.out.println("_____--_____");
		String expected= "You may qualify for a multi-policy discount!";
		String actual= "   You may qualify for a multi-policy discount!   "; 
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
		
		
		
		
		
		
	}

}
