package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2Task {
	
//	Create a map of countries with its capital. 
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.

	public static void main(String[] args) {
		
		Map<String, String> countries=new HashMap<>();
		countries.put("Madrid", "Spain");
		countries.put("Washington DC", "USA");
		countries.put("Paris", "France");
		countries.put("Bogata", "Colombia");
		countries.put("La Paz", "Bolivia");
		
		System.out.println(countries);
		
		Set <String> capitals=countries.keySet();
		
		for (String str: capitals) {
			System.out.println(str+" ";
			
	    Iterator<String> itValues=keys.iterator();
	    while(itValues.hasNext()) {
				System.out.print(itValues.next()+", ");
		
	}

	}}}
