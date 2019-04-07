package com.class17_2;

import java.util.Scanner;
public class ScannerMethod { 
	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter a");  
		int a = scan.nextInt();   
		System.out.println("Enter b"); 
		int b = scan.nextInt();  
		System.out.println(obj.sum(a, b));  
		/*         * obj.sum(12, 13); obj.sum(100, 101);    
		 *      *         * obj.sub(); obj.sub();     
		 *          */  
		}      
	public int sum(int x, int y) {
		// System.out.println(x+y);  
		return x + y;    }
	void sub() { 
		int a = 10, b = 12; 
		{System.out.println(a - b);    }}}



