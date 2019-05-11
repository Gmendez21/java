package com.class32;

import java.util.ArrayList;

public class CreditCardTest {
	
	public static void main(String[] args) {
		
		Visa visa=new Visa("Visa Platinum");
		
		Ax ax=new AX ("AX Rewards");
		
		MasterCard mc=new MasterCard("MC basic"); 
		
		ArrayList<CreditCard> alist=new ArrayList<>();
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);
		
		//how can I get a name of each card?
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
			card.interestRate();
			System.out.println("---------");
		}
		//how can we print an interest rate of each card
		Iterator<CreditCard> myIterator=alist.iterator();
		
		
		
		
	}

}
