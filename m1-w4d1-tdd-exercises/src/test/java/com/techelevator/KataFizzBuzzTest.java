package com.techelevator;

import org.junit.*;

public class KataFizzBuzzTest {
	//only numbers between 1-100
	//if not multiple of/contains 3 or 5 - return the number as a string
	//multiples of 3 return "fizz"
	// multiples of 5 return "buzz"
	//multiples of both 3 & 5 return "fizzbuzz"
	//if string contains 3 return fizz
	//if string contains 5 return buzz
	// multiple of 3 & contains 5 return "fizzBuzz"
	//multiple of 5 & contains 3 return "fizzBuzz"


	KataFizzBuzz fizzBuzz;
	
	@Before
	public void setup() {
		fizzBuzz = new KataFizzBuzz();
	}
	
	@Test
	public void return_empty_string_for_numbers_out_of_range() {
		Assert.assertEquals("", fizzBuzz.fizzBuzz(0));
		Assert.assertEquals("", fizzBuzz.fizzBuzz(101));
	}
	
	@Test
	public void return_number_if_not_divisible_or_contains_3_or_5() {
		Assert.assertEquals("1", fizzBuzz.fizzBuzz(1));
		Assert.assertEquals("44", fizzBuzz.fizzBuzz(44));
		Assert.assertEquals("98", fizzBuzz.fizzBuzz(98));
	}
	
	@Test
	public void return_fizz_for_multiples_of_3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(42));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(99));
	}
	
	@Test
	public void return_buzz_for_multiples_of_5() {
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(70));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(100));
	}
	
	@Test
	public void return_fizzbuzz_for_multiples_of_3_and_5() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(60));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
	}
	
	@Test
	public void return_fizz_if_contains_3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(13));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(43));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(83));
	}
	
	@Test
	public void return_fizz_if_contains_5() {
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(52));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(58));
	}
	
	@Test 
	public void return_fizzbuzz_if_multiple_of_3_and_contains_5() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(51));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(54));
	}
	
	@Test 
	public void return_fizzbuzz_if_multiple_of_5_and_contains_3() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(35));
	}
}
