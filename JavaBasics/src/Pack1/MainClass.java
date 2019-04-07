package Pack1;

public class MainClass {
	
						   // all variables outside here is global/instance
	
	public static void main (String[] args ) {
		X x = new X();
		
		X y = new X();     // all variables inside here is local
		
		System.out.println(x.i);
		
		System.out.println();
		
		x.methodOfX(); 
		}
	}

