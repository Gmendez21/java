package com.class14;

public class StringManipulations {
	
	public static void main(String[] args) {
		
//		String str="I am a good tester"; 
//		String newStr=str.replace("a", "e");
//		System.out.println(newStr);
		
//		_________________________________________________________________________________________
		
		String str1= "12Hello 3234 World 465%^%";
		String replacedNoNumbers=str1.replaceAll("[a-z]",  ""); 
		System.out.println(replacedNoNumbers);
		
		String replacedNoCharacter=replacedNoNumbers.replaceAll ("[0-9]", "");
        System.out.println(replacedNoCharacter); 
        	
        }  
//        ask during break how do get just hello world 
        
//        _________________________________________________________________________________________
        
//        String str2 = "1Hello123"; 
//        System.out.println(str2.replaceAll("[^0-9]", "")); //watch for ^ sign, play around with this 
        
//       ____________________________________________________________________________________________
        
        
		
	
		
		
		
	}


