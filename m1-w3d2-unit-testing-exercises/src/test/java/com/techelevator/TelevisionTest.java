package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {

	private Television television;
	
	@Before
	public void setup() {
		television = new Television();
	}
	 
	@Test
	public void volume_not_past_10() {
		//Arrange
		television.TurnOn();
		//Act
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		int level = television.getCurrentVolume();
		//Assert
		Assert.assertEquals(10, level);
	}
	
	@Test
	public void turn_tv_off() {
		//Arrange
		television.TurnOn();
		//Act
		television.TurnOff();
		boolean power = television.IsOn();
		//Assert
		Assert.assertFalse(power);
	}
	@Test
	public void turn_tv_on() {
		
		//Act
		television.TurnOn();
		boolean power = television.IsOn();
		//Assert
		Assert.assertTrue(power);
	}
	@Test
	public void tv_starts_on_volume_2() {
		//Act
		television.TurnOn();
		int volume = television.getCurrentVolume();
		//Assert
		Assert.assertEquals(2, volume);
	}
	@Test
	public void turn_vol_down() {
		//Arrange
		television.TurnOn();
		//Act
		television.LowerVolume();
		int vol = television.getCurrentVolume();
		//Assert
		Assert.assertEquals(1, vol);
	}
	
	@Test
	public void turn_vol_up() {
		//Arrange
		television.TurnOn();
		//Act
		television.RaiseVolume();
		int vol = television.getCurrentVolume();
		//Assert
		Assert.assertEquals(3, vol);
	} 
	
	@Test
	public void changes_channel() {
		//Arrange
		television.TurnOn();
		//Act
		television.ChangeChannel(7);
		//Assert
		Assert.assertEquals(7, television.getSelectedChannel());
	}
	@Test
	public void no_channels_before3() {
		//Arrange
		television.TurnOn();
		//Act
		television.ChangeChannel(1);
		//Assert
		Assert.assertEquals(3, television.getSelectedChannel());
	}
	@Test
	public void no_channels_after18() {
		//Arrange
		television.TurnOn();
		//Act
		television.ChangeChannel(20);
		//Assert
		Assert.assertEquals(3, television.getSelectedChannel());
	}
	  

}
