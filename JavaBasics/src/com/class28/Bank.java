package com.class28;

public interface Bank {
	
	void hasChecking(); 
	void hasSavings(); 
	void hasCreditCard(); 
	
} 

class BOA implements Bank{ 
	

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking account");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings account");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
		
	}
}


