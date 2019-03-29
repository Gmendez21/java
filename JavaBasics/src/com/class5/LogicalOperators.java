package com.class5;

public class LogicalOperators {
	
// Logical AND &&: 
//	True and true = true
//	true and false/false and true = false 
//	false and false = false 
	
// Logical OR || 
//	True or True = true 
//	true or false = true 
//	false or true = true 
//	false or false or false = false
	
	if (age>=1 && age<3) {
		System.out.println("You are a baby");
	}else if (age>=3 && age<5) {
		System.out.println("you are a toddler");
	}else if (age>=5 && age<13) {
		System.out.println("you are a kid");
	}else if (age>=13 && age<20) {
		System.out.println("you are a teenager");
	}else if (age>=20 && age<64) {
		System.out.println("you are a adult");
	}else {
		System.out.println("you are a senior");
	}
		
}
}
