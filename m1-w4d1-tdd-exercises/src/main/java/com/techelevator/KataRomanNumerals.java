package com.techelevator;
	import java.util.TreeMap;

public class KataRomanNumerals {


	    private final static TreeMap<Integer, String> romanNumeralMap = new TreeMap<Integer, String>();

	    {
	   
	    	romanNumeralMap.put(100, "C");
	    	romanNumeralMap.put(90, "XC");
	    	romanNumeralMap.put(50, "L");
	    	romanNumeralMap.put(40, "XL");
	    	romanNumeralMap.put(10, "X");
	    	romanNumeralMap.put(9, "IX");
	    	romanNumeralMap.put(5, "V");
	    	romanNumeralMap.put(4, "IV");
	    	romanNumeralMap.put(1, "I");

	    }

	    public final static String toRoman(int number) {
	        int i =  romanNumeralMap.floorKey(number);
	        if ( number == i ) {
	            return romanNumeralMap.get(number);
	        }
	        return romanNumeralMap.get(i) + toRoman(number-i);
	    }
	    
	    
	    private final static TreeMap<String, Integer> arabicMap = new TreeMap<String, Integer>();

	    {
	   
	    	arabicMap.put("C", 100);
	    	arabicMap.put("XC", 90);
	    	arabicMap.put("L", 50);
	    	arabicMap.put("XL", 40);
	    	arabicMap.put("X", 10);
	    	arabicMap.put("IX", 9);
	    	arabicMap.put("V", 5);
	    	arabicMap.put("IV", 4);
	    	arabicMap.put("I", 1);
	    }
	    	
	    	 public final static Integer toArabic(String romanNumeral) {
	 	        String i =  arabicMap.floorKey(romanNumeral);
	 	        if ( romanNumeral.contains(i)) {
	 	            return arabicMap.get(romanNumeral);
	 	        }
	 	        return 1;
	 	    }

	    }
	    
	    

	