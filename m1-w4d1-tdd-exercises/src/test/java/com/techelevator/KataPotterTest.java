package com.techelevator;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class KataPotterTest {
	KataPotter kataPotter;
	
	@Before
	public void setup() {
		kataPotter = new KataPotter();
	}
	
	@Test
	public void no_books_returns_zero() {
		int[] booksArray = new int[] {0, 0, 0, 0, 0};
		Assert.assertEquals(0, kataPotter.getCost(booksArray), 0);
	}	
	
	@Test
	public void one_book_returns_eight() {
		int[] booksArray = new int[] {1, 0, 0, 0, 0};
		Assert.assertEquals(8.00, kataPotter.getCost(booksArray), 0);

	}
	@Test
	public void two_different_books_yeilds_5_percent_discount() {
		int[] booksArray = new int[] {1, 1, 0, 0, 0};
		Assert.assertEquals(15.20, kataPotter.getCost(booksArray), 0);
		
		booksArray = new int[] {1, 0, 0, 0, 1};
		Assert.assertEquals(15.20, kataPotter.getCost(booksArray), 0);


	}
	
	
}
