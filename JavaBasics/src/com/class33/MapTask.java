package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
	
//	Create a map of a building. 
//	Store floor number and it is associated company name.
//	(Example: 1= Google, 2=Syntax etc..). 
//	Insert 7 entries with duplicate keys and values.
//	Check how many entries you have?
//  Update company on a 4th floor
//  Remove company on the 7th floor
//  Print your map
	
	public static void main(String[] args) {
		
		Map<Integer, String > map=new HashMap<>();
		
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Yelp");
		map.put(4, "Facebook");
		map.put(5, "Yelp");
		map.put(6, "Syntax");
		map.put(7, "Google");
		
		System.out.println(map.size());
		
		map.replace(4, "Myspace");
		System.out.println(map.get(4));
		
		map.remove(7);
		System.out.println(map.size());
		
		System.out.println(map);
		
	
	}

	
}


