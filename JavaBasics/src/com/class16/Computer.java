package com.class16;

public class Computer {
	
	String os, brand;
	boolean mouse, keyboard = true;
	int screen, ram;
	
	public static void main(String[] args) {
		
		Computer comp1= new Computer(); 
		comp1.os="Windows"; 
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.brand="HP"; 
		
		Computer comp2= new Computer();
		comp2.mouse=false;
		comp2.keyboard = false; 
		comp2.screen = 4; 
		comp2.ram = 8;
		comp2.os = "Mac OS";
		comp2.brand="Apple";
		
		comp1.watchMovie();
		comp1.doJavacoding();
		comp1.playMusic();
		
		comp2.watchMovie();
		comp2.doJavacoding();
		comp2.playMusic();
		
	}
	
	
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+ brand);
	}
	
	void doJavacoding() { 
		System.out.println("We can do Java coding on our computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
	
	
	
	
	
	
	
	


}