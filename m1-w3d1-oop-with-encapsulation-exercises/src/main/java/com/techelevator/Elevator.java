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

	public void openDoor() {
	//opens the elevator door.
		doorOpen = true;
	}
	public void closeDoor() { // closes the elevator door.
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
	// sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	
		if(! this.isDoorOpen()) {
			if(desiredFloor >= this.currentFloor && desiredFloor <= this.numberOfFloors) {
			this.currentFloor = desiredFloor;
			} else {
				this.currentFloor += 0;
			}	
			} else {
				this.currentFloor += 0;
			}
		}
		   

	
	public void goDown(int desiredFloor) {
	//sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
		if(! this.isDoorOpen()) {
			if(desiredFloor >= 1 && desiredFloor <= this.currentFloor) {
			this.currentFloor = desiredFloor;
		} else { 
			this.currentFloor += 0;
		}
		}else { 
			this.currentFloor +=0;
		}
	}

	public Elevator(int totalNumberOffloors){
//indicates how many floors are available to the elevator
		this.numberOfFloors = totalNumberOffloors;
}

}
