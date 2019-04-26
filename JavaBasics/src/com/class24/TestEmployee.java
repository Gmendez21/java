package com.class24;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor contractor = new Contractor(); 
		
		emp.getPaid();
		ft.getPaid();
		contractor.getPaid();
		
		
		
	}

}
