package com.techelevator;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class KataPotterTest {
	KataPotter kataPotter;
	
	@Before
	public void setup() {
		int[] newArray = new int[] {1, 2, 3, 4, 5};
		kataPotter = new KataPotter();
		Assert.assertEquals(0, newArray);
	}
	
	@Test
	public void no_books_returns_zero() {
		
		kataPotter = new KataPotter();
		Assert.assertEquals(0, newArray);
	}	
	
	@Test
	public void one_book_returns_eight() {
		Assert.assertEquals(0, kataPotter.getCost(b), 0);
	}
	
}
