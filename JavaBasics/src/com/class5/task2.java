package com.class5;

import java.util.Scanner;

public class task2 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("what is your grade?");
		int grade = input.nextInt();
	    int quiz;
	    int midterm;
	    int finalscore;
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("What is your quiz grade?");
	    quiz = scan.nextInt();
	
	    System.out.println("What is your midterm grade?");
	    midterm = scan.nextInt();
	   
	    System.out.println("What is your finalscore grade?");
	    finalscore = scan.nextInt();
	    
	    int avgScore = (quiz+midterm+finalscore)/3;
		
		if (grade >=90 && grade <=100) {
			System.out.println("You have an A");
	
		}else if (grade >=70 && grade <=89) {
			System.out.println("You have a B");
		}else if (grade >=50 && grade <=69) {
			System.out.println("You have a C");
		}else if (grade >=70 && grade <=89) {
				System.out.println("You have a B");
		}else if (grade <50 && grade >=0) {
			System.out.println("You have an F");
		}else {
			System.out.println("You suck at life");
		}
		
	}

	}
 

