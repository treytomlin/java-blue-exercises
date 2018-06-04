package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;
	
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	public int add(int addend) {
		//returns the new currentValue after performing the addition.
		int addValue = this.currentValue + addend;
		return addValue;
	}
	
	
	public int multiply(int multiplier) {
		// returns the new currentValue after performing the multiplication.
		int multiValue = this.currentValue * currentValue;
		return multiValue;
	}
	
	public int subtract(int subtrahend) {
		// returns the new currentValue after performing the subtraction.
		int subValue = currentValue - this.currentValue;
		return subValue;
	}
	public int power(int exponent) {
		//returns the new currentValue after raising the currentValue by the exponent.
		int powerValue = (currentValue * currentValue) * this.currentValue;
		return powerValue;
		
	}
	public void reset() {
		//resets the currentValue to 0.
		currentValue = 0;
	}
}
