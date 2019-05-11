package com.class31;

import java.util.ArrayList;
import java.util.Iterator;



public class Cars {
	
public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<String>();
		
		cars.add("Lamborgini"); 
		cars.add("BMW");
		cars.add("Hummer"); 
		cars.add("Corvette");
		
		for(int i =0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		
}
		
		for(String c: cars) {
			System.out.println(c);

}
		Iterator<String> it=cars.iterator();
		
		while(it.hasNext()) {
			String car=it.next();
			System.out.println(car);
	

		}
		
		
		
       
		}}
