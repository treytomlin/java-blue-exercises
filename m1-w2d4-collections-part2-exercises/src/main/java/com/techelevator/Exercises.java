package com.techelevator;

import java.util.HashMap;
<<<<<<< HEAD
import java.util.LinkedHashSet;
=======
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {
// 1 set problem, the rest are maps
	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		
		if(animalName == null || animalName.length() < 1) { // null must come first
			return "unknown";
		
		}
		// .ignoreCase
		Map<String, String> animalGroups = new HashMap<String, String>();
		animalGroups.put("rhino", "Crash");
		animalGroups.put("giraffe", "Tower");
		animalGroups.put("elephant", "Herd");
		animalGroups.put("lion", "Pride");
		animalGroups.put("crow", "Murder");
		animalGroups.put("pigeon", "Kit");
		animalGroups.put("flamingo", "Pat");
		animalGroups.put("deer", "Herd");
		animalGroups.put("dog", "Pack");
		animalGroups.put("crocodile", "Float");
		
		String group = animalGroups.get(animalName.toLowerCase());
		
		if (group == null) {
			return "unknown";
		}
		
		return group;
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		if(itemNumber == null || itemNumber == "") {  // filters out any null 
			return 0.00;
		}
		
		Map<String, Double> mapOfSkus = new HashMap<String, Double>();
		mapOfSkus.put("kitchen4001", 0.20);
		mapOfSkus.put("garage", 0.15);
		mapOfSkus.put("livingroom", 0.10);
		mapOfSkus.put("kitchen6073", 0.40);
		mapOfSkus.put("bedroom3434", 0.60);
		mapOfSkus.put("bath0073", 0.15);
		
		
		
		Double skuGroups = mapOfSkus.get(itemNumber.toLowerCase());
		if(skuGroups == null) { // checks if the value is null
			return 0.00;  // if so return 0.00
		}
		
		
		return skuGroups; // return the value 
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int newPeter;
		int newPaul;
		
		
		if (peterPaul.get("Peter") > 0 &&  peterPaul.get("Paul") < 1000){ 
			if(peterPaul.get("Peter") % 2 == 0){
				newPeter = ((peterPaul.get("Peter")) / 2);
				newPaul = (peterPaul.get("Paul") + (peterPaul.get("Peter") / 2));
				
			}
			else {
				newPeter = ((peterPaul.get("Peter") + 1) / 2);
				newPaul = (peterPaul.get("Paul") + (peterPaul.get("Peter") / 2));
			}
			
			peterPaul.put("Peter", newPeter);
			peterPaul.put("Paul", newPaul);
			
		}
		
		
		return peterPaul;
	}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int newPeter;
		int newPaul;
		int newPartnership;
	
		if (peterPaul.get("Peter") >= 5000 &&  peterPaul.get("Paul") >= 10000){ 
			if(peterPaul.get("Peter") % 2 == 0){
				newPeter = ((peterPaul.get("Peter")) / 4);
				newPaul = ((peterPaul.get("Paul") ) / 4);
			}
			
			else {
				newPeter = ((peterPaul.get("Peter") + 1) / 4);
				newPaul = (peterPaul.get("Paul") + (peterPaul.get("Peter") / 4));
				
			}
			newPartnership = newPeter + newPaul;
			peterPaul.put("Peter", newPeter * 3);
			peterPaul.put("Paul", newPaul * 3);
			peterPaul.put("PeterPaulPartnership", newPartnership);
		}
		return peterPaul;
		
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> ourMap = new HashMap<String, String>();
		String stringA = "";
		String stringB = "";
		
		
		for (String beginning : words) {
			stringA = beginning.substring(0, 1);
			stringB = beginning.substring(beginning.length() -1);
			ourMap.put(stringA, stringB);
		}
		return ourMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
			Map <String, Integer> ourMap = new HashMap <String, Integer>();
			for (String letter : words) {
			ourMap.get(letter);
			if (ourMap.containsKey(letter)) {
			ourMap.put(letter, ourMap.get(letter) + 1);
			}
			else {
			ourMap.put(letter, 1);
			}
			}
			return ourMap;
			}
		
	
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map <Integer, Integer> ourMap = new HashMap <Integer, Integer>();
		for (Integer value : ints) {
		ourMap.get(value);
		if (ourMap.containsKey(value)) {
		ourMap.put(value, ourMap.get(value) + 1);
		}
		else {
		ourMap.put(value, 1);
		}
		}
		return ourMap;
		}
	
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> newMap = new HashMap<String, Boolean>();
		
		for(String word : words) {
			newMap.get(word);
			if(newMap.containsKey(word)) {
				
			}
		}
		
		return newMap;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		return null;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		
		Map<String, Integer> output = new HashMap<String, Integer>();
		
		for (String str : words) {
			
			int count = 0;
			
			if (str.length() <= 2) {
				output.put(str, count);
				continue;
			}
			
			String last2 = str.substring(str.length() - 2);
			
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 2).equals(last2)) {
					count++;
				}
			}
			
			output.put(str, count);
		}
		
		return output;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		return null;
	}

}
