package com.class21;

public class LocalVariables {
	
public static void main(String[] args) {
	
	String name = "John"; 
	System.out.println(name); 
	
	LocalVariables obj = new LocalVariables(); 
	obj.hello(name); 
	
}

public void hello(String name) {    //wont work unless there is a parameter inside...like name
	name = "Jack";
	System.out.println("Hello "+name);
	
}



}
