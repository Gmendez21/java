package com.class32;

public abstract class CreditCard {

	public String creditCardName; 
	
	public CreditCard(String creditCardName) { 
		this.creditCardName=creditCardName; 
	}
	
	public void openAccount() { 
		System.out.println("Open "+creditCardName+" credit card");
	}
	
	public abstract void interestRate(); 
	public abstract void annualFee();
	
class Visa extends CreditCard { 
	
	public Visa(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+);
		
		
	}

	@Override
	public void annualFee() {
		// TODO Auto-generated method stub
		
	}
}
	
}


