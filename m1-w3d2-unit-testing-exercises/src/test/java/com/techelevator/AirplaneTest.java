package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AirplaneTest {
	private Airplane airplane;
	
	@Before
	public void setup() {
		airplane = new Airplane(100, 100);
	}
	
	@Test
	public void available_first_class_seats_accuracy() {
		//Act
		airplane.getAvailableFirstClassSeats();
		//Assert
		Assert.assertEquals(100, airplane.getAvailableFirstClassSeats());
	}
	@Test
	public void available_coach_seats_accuracy() {
		//Act
		airplane.getAvailableCoachSeats();
		//Assert
		Assert.assertEquals(100, airplane.getAvailableCoachSeats());
	} 
 
	@Test
	public void post_first_class_booking_accuracy() {
		airplane.Reserve(true, 100);
		airplane.getBookedFirstClassSeats();
		Assert.assertEquals(100, airplane.getAvailableFirstClassSeats());
	} 
	@Test
	public void post_coach_booking_accuracy() {
		airplane.Reserve(false, 50);
		airplane.getBookedCoachSeats();
		Assert.assertEquals(50, airplane.getBookedCoachSeats());
	}

	@Test
	public void cant_over_book_first_class() {
		boolean overBook = airplane.Reserve(true, 200);
		airplane.getAvailableFirstClassSeats();
		Assert.assertFalse(overBook);
		Assert.assertEquals(100,airplane.getAvailableFirstClassSeats());
	}
	@Test
	public void cant_over_book_coach() {
		boolean overBook = airplane.Reserve(false, 200);
		airplane.getAvailableCoachSeats();
		Assert.assertFalse(overBook);
		Assert.assertEquals(100, airplane.getAvailableCoachSeats());
	}  

}
