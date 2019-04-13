package com.class20;

public class Student {
	
	public static void main(String[] args) {
		
	
	
	
	Student obj = new Student(); 
	char myGrade = obj.getGrade(91);
	
	
	
	//go over this with a student at the end... 
	
}

	
	 char getGrade(int score) {
		 char grade ;
		
		if (grade >= 90) {
			grade = 'A';
		}else if(grade >80) {
			grade = 'B';
		}
		
		else if (grade >70) {
			grade = 'C';;
		}
	
		else if (grade >60) {
			grade = 'D';
		}
		
		else (grade 50) {
			grade = 'F';
		}
		
		return grade;
		
	}
	
	//go over this 

}
