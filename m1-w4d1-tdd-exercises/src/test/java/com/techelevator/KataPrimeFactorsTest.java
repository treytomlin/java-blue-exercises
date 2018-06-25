package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Arrays;

public class KataPrimeFactorsTest {
	KataPrimeFactors nums;
	
	@Before
	public void setUp() {
		nums = new KataPrimeFactors();
	}
	@Test
	public void testOne() {
		
		int [] result = nums.primeFinder(1);
		Arrays.sort(result);

		assertArrayEquals(new int[] {1}, result);
	}
	@Test
	public void testTwo() {
		
		int [] result = nums.primeFinder(2);
		Arrays.sort(result);

		assertArrayEquals(new int[] {2}, result);
	}
	@Test
	public void testFive() {
		
		int [] result = nums.primeFinder(5);
		Arrays.sort(result);

		assertArrayEquals(new int[] {5}, result);
	}
	
	@Test
	public void testSix() {
		int[] result = nums.primeFinder(6);
		Arrays.sort(result);
		assertArrayEquals(new int[] {2,3}, result);
	}
	
	
	@Test
	public void test96() {
		int[] result = nums.primeFinder(96);
		Arrays.sort(result);
		assertArrayEquals(new int[] {2,2,2,2,2,3}, result);
	}
}