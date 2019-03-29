package com.class12;

public class StringManipulations3 {
	
	public static void main(String[] args) {
		
		String str="Students"; 
		
//		char character=str.charAt(7); 
//		System.out.println(character);
		
		for(int i=0; i<str.length(); i++) {
		System.out.print(str.charAt(i)+",");
		}
		System.out.println();	
		
		System.out.println("-------indexOf()------");
		String str1= "Sunday";
		int index = str1.indexOf("a");
		System.out.println(index);
		
		String str2="Syntax Technologies"; 
		System.out.println(str2.indexOf("Syntax"));
		//practice more on your own 
		
		
		
	//------------------------------------------------------------------------------------	
		System.out.println("------substring-----");
		
		String str3="Today is Sunday Java class";
		
       String newString=str3.substring(9); 
		System.out.println(newString); 
		
		System.out.println(str3.substring(0, 5)); //Today
		
		
		
		
		
	}

}
