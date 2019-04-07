package com.class17_2.copy;

public class NestedLoop2 {
	
	public static void main(String[] args) {
	
	NestedLoop2 obj = new NestedLoop2();
	
	obj.loop2();
	
	
}
		
		void loop2() {
		
		for (int i = 0; i < 5 ; i++) {
			
			for (int y = 5; y >= 1; y--) {
				
				System.out.print(y);
			}
			
			System.out.println();
			
//		12345 x 4 
			
//		54321 x 4
			
		}
		
	}
	

}
