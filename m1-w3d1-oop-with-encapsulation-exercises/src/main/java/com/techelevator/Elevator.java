package com.techelevator;

public class Elevator {
	
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	private int totalNumberOfFloors;
	
	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	void openDoor() {
	//opens the elevator door.
		doorOpen = true;
	}
	void closeDoor() { // closes the elevator door.
		doorOpen = false;
	}
	
	void goUp(int desiredFloor) {
	// sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	}
	
	void goDown(int desiredFloor) {
	//sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
	}

	public Elevator(int totalNumberOffloors){
//indicates how many floors are available to the elevator
		this.totalNumberOfFloors = totalNumberOffloors;
}

}
