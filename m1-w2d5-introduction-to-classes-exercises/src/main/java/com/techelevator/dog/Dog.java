package com.techelevator.dog;

public class Dog {

	private boolean sleeping = false;
		
		
	public boolean isSleeping() {
		return this.sleeping;
	}
	
	
	
	public String makeSound() {
		//returns "Zzzzz..." if the dog is asleep. Returns "Woof!" if the dog is awake.
		if (this.isSleeping()) {
			String sound = "Zzzzz...";
					
			return sound;
		}
		String sound = "Woof!";
		return sound;
	}
	
	
	public void sleep() {
		//sets sleeping to true.
		sleeping = true;
	}
	
	public void wakeUp() { 
		// sets sleeping to false.
		sleeping = false;
	}
}

