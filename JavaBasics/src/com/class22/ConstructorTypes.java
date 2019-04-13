package com.class22;

public class ConstructorTypes {
	
	ConstructorTypes(){
		
		System.out.println("I am a constructor with no parameters");
	}
	
    ConstructorTypes(String str){
		
		System.out.println("I am a constructor with 1 parameter "+str);
    }
    
    ConstructorTypes(int a, String str){
		
		System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
		
    }
    
    
	public static void main(String[] args) {
		
		ConstructorTypes obj1=new ConstructorTypes(); 
		
		ConstructorTypes obj2=new ConstructorTypes("String");  
		
		ConstructorTypes obj3=new ConstructorTypes(123, "String"); //the order has to match

	}
	
	
	
}