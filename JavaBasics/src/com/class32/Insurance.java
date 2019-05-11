package com.class32;

public abstract class Insurance {
	
	public String insuranceName; 
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName; 
			
	}

	public abstract void getQuote();
	public abstract void cancelInsurance();
	
}

class CarInsurance extends Insurance {
	
public CarInsurance (String insuranceName) {
	super (insuranceName);
	
}

@Override
public void getQuote() {
	System.out.println("Let's get the quote from "+insuranceName);
	
}

@Override
public void cancelInsurance() {
	System.out.println("Let's cancel my insurance "+insuranceName);
	
}	
	
}

class PetInsurance extends Insurance {
	
	public PetInsurance (String insuranceName) {
		super (insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Lets cancel my insurance "+insuranceName);
		
	
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	} 
	

}

class HealthInsurance extends Insurance {
	
	public HealthInsurance (String insuranceName) {
		super (insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Let's get the quote from "+insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		
		// TODO Auto-generated method stub
		
	} 
	
	
}