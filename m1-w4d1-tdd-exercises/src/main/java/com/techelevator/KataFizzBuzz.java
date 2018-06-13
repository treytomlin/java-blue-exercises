package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int value) {
		if(value < 1 || value > 100) {
			return "";
		}
		
		if(isDivisibleBy(3, value) && isDivisibleBy(5, value)) {
			return "FizzBuzz";
		}
		if(isDivisibleBy(3, value) && containsDigit(5, value)) {
			return "FizzBuzz";
		}
		if(isDivisibleBy(5, value) && containsDigit(3, value)) {
			return "FizzBuzz";
		}
		
		if(isDivisibleBy(3, value)) {
			return "Fizz";
		}
		if(isDivisibleBy(5, value)) {
			return "Buzz";
		}
		if(isDivisibleBy(3, value) && isDivisibleBy(5, value)) {
			return "FizzBuzz";
		}
		if(containsDigit(3, value)) {
			return "Fizz";
		}
		if(containsDigit(5, value)) {
			return "Buzz";
		}
	 
		 
		return String.valueOf(value);
	}
	
	private boolean isDivisibleBy(int multiple, int number) {
		return number % multiple == 0;
	}
	
	private boolean containsDigit(int digit, int number) {
		return String.valueOf(number).contains(String.valueOf(digit));
	}

} 
 