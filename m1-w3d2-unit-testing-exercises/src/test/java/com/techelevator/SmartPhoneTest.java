package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SmartPhoneTest {

	private SmartPhone smartPhone;
	
	@Before
	public void setup() {
		smartPhone = new SmartPhone("6142370208", "Verizon" );
	}
	@Test
	public void hang_up_works() {
		//Arrange
		smartPhone.Call("6142370208", 10);
		smartPhone.AnswerPhone();
		//Act
		smartPhone.HangUp();
		//Assert
		Assert.assertTrue(false);
		
	}
	
	
	
	@Test
	public void battery_charge_100_percent() {
		//arrange
		smartPhone.getBatteryCharge();
		//Act
		smartPhone.RechargeBattery();
		//Assert
		Assert.assertEquals(100, smartPhone.getBatteryCharge());
		
	} 
	
	@Test
	public void call_a_7_digit_phone_number() {
		//Act
		smartPhone.Call("2370208", 60);
		//Assert
		Assert.assertTrue(false);
		
	} 
	
	@Test
	public void cant_talk_beyond_100percent() {
		//Act
		smartPhone.Call("6142370208", 150);
		//Assert
		Assert.assertTrue(false);
	}
	@Test
	public void phone_call_allowed() {
		//Act
		smartPhone.Call("6142370208", 20);
		//Assert
		Assert.assertTrue(true );
	}
	@Test
	public void hang_up_twice() {
		//Arrange
		smartPhone.Call("6142370208", 10);
		smartPhone.AnswerPhone();
		//Act
		smartPhone.HangUp();
		smartPhone.HangUp();
		//Assert
		Assert.assertTrue(false);
		
	}
	
	
	
	
	
}
