package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ElevatorTest {
	
	Elevator elevator;
	
	@Before
	public void setup() {
		elevator = new Elevator(1, 13);
	}
	@Test
	public void elevator_door_doesnt_open_if_moving() {
		//set up
		elevator.isMoving();
		
		//Test if door opens when moving
		elevator.OpenDoor();
		
		Assert.assertTrue(false);

	}

	@Test
	public void elevator_should_not_go_up_with_door_open() {
		// Set up - open the door
		elevator.OpenDoor();
		
		// Test - try to move the elevator
		elevator.GoUp(5);
		
		Assert.assertEquals(1, elevator.getCurrentLevel()); 
	}
	
	
	 @Test
	 public void elevator_goes_up_when_closed() {
		 //Set up - close the door
		 elevator.CloseDoor();
		 
		 //Test - try to move the elevator
		 elevator.GoUp(5); 
		 
		 Assert.assertTrue(true);
		 Assert.assertEquals(5, elevator.getCurrentLevel());
	 } 
	 
	 @Test
	 public void elevator_door_closes() {
		 //Set-up
		 elevator.OpenDoor();
		 //Test - Try to close door
		 elevator.CloseDoor();
		 elevator.CloseDoor();
		 
		 Assert.assertTrue(true);
	 }
	 
	 @Test
	 public void elevator_goes_down() {
		 //Set UP
		 elevator.CloseDoor();
		 elevator.GoUp(10);
		 //Test
		 elevator.GoDown(5);
		 
		 Assert.assertTrue(true);
		 Assert.assertEquals(5, elevator.getCurrentLevel());
	 }
	 
		@Test
		public void elevator_should_not_go_down_with_door_open() {
			// Set up - open the door
			elevator.OpenDoor();
			
			// Test - try to move the elevator
			elevator.GoDown(1);
			
			Assert.assertEquals(1, elevator.getCurrentLevel()); 
		}
		
		@Test
		public void elevator_stays_on_floor() {
			// Set up - open the door
			elevator.OpenDoor();
			elevator.CloseDoor();
			elevator.GoUp(5);
			
			// Test - try to move the elevator
			elevator.GoUp(5);
			
			Assert.assertEquals(5, elevator.getCurrentLevel()); 
		}
		
	  
	 
} 
