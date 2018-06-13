package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalFirstClassTest {
	private PostalFirstClass postalFirstClass;
	
	@Before
	public void setup() {
		postalFirstClass = new PostalFirstClass();	
	}
	
	@Test
	public void zero_to_two_ounce_accuracy() {
		Assert.assertEquals(0.35, postalFirstClass.calculateRate(10, 2), 0);
	}
	
	@Test
	public void three_to_eight_ounce_accuracy() {
		Assert.assertEquals(0.40, postalFirstClass.calculateRate(10, 8), 0);
	}
	
	@Test
	public void nine_to_fifteen_ounce_accuracy() {
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 9), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 10), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 11), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 12), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 13), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 14), 0);
		Assert.assertEquals(0.47, postalFirstClass.calculateRate(10, 15), 0);
	}
	
	@Test
	public void one_to_three_pound_accuracy() {
		Assert.assertEquals(1.95, postalFirstClass.calculateRate(10, 3), 0);
		Assert.assertEquals(1.95, postalFirstClass.calculateRate(10, 2), 0);
		Assert.assertEquals(1.95, postalFirstClass.calculateRate(10, 1), 0);

	}

}
