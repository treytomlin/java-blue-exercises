package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;
	
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	public int add(int addend) {
		//returns the new currentValue after performing the addition.
		return currentValue += addend;
	}
	
	
	public int multiply(int multiplier) {
		// returns the new currentValue after performing the multiplication.
		return currentValue *= multiplier;
	}
	
	public int subtract(int subtrahend) {
		// returns the new currentValue after performing the subtraction.
		return currentValue -= subtrahend;
	}
	public int power(int exponent) {
		//returns the new currentValue after raising the currentValue by the exponent.
		return currentValue = (int) Math.pow(currentValue, exponent);
		
	}
	public void reset() {
		//resets the currentValue to 0.
		currentValue = 0;
	}
}
