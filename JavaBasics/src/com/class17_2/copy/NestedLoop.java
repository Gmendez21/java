package com.class17_2.copy;

public class NestedLoop {
	
	public static void main(String[] args) {
	
	NestedLoop obj = new NestedLoop();
	
	obj.loop();
	
}
		
		void loop() {
		
		for (int i=0; i<3; i++) {
			
			for (int y=0; y<3; y++) {
			
				System.out.println("I am inner loop " + y);
			}
			{
				
				System.out.println("------I am outer loop------ " + i);
			
		}
		
	}

}}

/// go over this. explain why 3 inner loops, and then 1 outer loop.