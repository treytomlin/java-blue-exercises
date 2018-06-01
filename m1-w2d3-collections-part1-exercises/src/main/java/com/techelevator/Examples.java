package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Examples {

	public static void main(String[] args) {
		Map<Integer, Boolean> ourMap = new HashMap<Integer, Boolean>();
		ourMap.put(10,  true);
		ourMap.put(20, false);
		System.out.println("10 is " + ourMap.get(10));
		boolean valueOf20 = ourMap.get(20);
		System.out.println("20 is " + valueOf20);;
		ourMap.put(10, false);
		System.out.println("10 is now " + ourMap.get(10));
		
		if(ourMap.get(20) == false) {
			System.out.println("20 is false");
}

		Map<String, String> items = new HashMap<String, String>();
		items.put("A1", "Chips");
		items.put("A2", "Soda");
		items.put("B1", "Candy");
		items.put("C2", "Gum");
		
		System.out.println("A1 has " + items.get("A1"));
			
		for (String key : items.keySet()) {
			System.out.println(key + " : " + items.get(key));
		}
		items.remove("A2");  // removes the key and the value
	
		if(items.containsKey("B1")) {
			System.out.println("B1 Exists");
		} else {
			System.out.println("B1 Does NOT Exist");
		}
		Map<String, Integer> inventory = new HashMap<String, Integer>();
		inventory.put("yellow pants",  5);
		inventory.put("green pants",  4);
		inventory.put("red pants", 8);
		
		System.out.println(inventory.get("green pants") + " green pants in the store!");
		
		if(inventory.containsKey("green pants")) {
			inventory.put("green pants", inventory.get("green pants") + 2);
			
		}
		System.out.println(inventory.get("green pants") + " green pants in the store!");
// make sure that the capitalization in the key is exactly the same, putting a space creates a null
		
		
		
		
		
		
		/* 
		 * Set Examples
		 */
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(10);
		numbers.add(10);
		numbers.add(8);
		numbers.add(502);
		
		System.out.println(numbers.size());
		
		for(Integer i : numbers) {
			System.out.println(i);
		}
		
		
		}

}


