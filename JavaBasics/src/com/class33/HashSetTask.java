package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetTask {
	
	public static void main(String[] args) {
		
		List<String> aList=new ArrayList <String> (); 
		
		aList.add("John"); 
		aList.add("Jane");
		aList.add("James"); 
		aList.add("Jasmine");
		aList.add("Jane"); 
		aList.add("James");
		
		//first way
		Set <String> hset=new LinkedHashSet<>();
		hset.addAll(aList);
		System.out.println(hset); 
		
		//second way
	
		
		
	}

}
