package com.techelevator.staticExample;

public class Store {
	private static double totalAmount = 0d;
	
	private Register registerOne;
	private Register registerTwo;
	
	public Store() {
		registerOne = new Register("One");
		registerTwo = new Register("Two");
	}
	
	public void makeSaleRegisterOne(double amount) {
		totalAmount += amount;
		this.registerOne.makeSale(amount);
	}
	
	public void makeSaleRegisterTwo(double amount) {
		totalAmount += amount;
		this.registerTwo.makeSale(amount);
	}
	
	
	public static double getTotalAmount() {
		return totalAmount;
		
	}
	
	@Override
	public String toString() {
		return "Store Total: $" + totalAmount + "\n" + registerOne.toString() + "\n" + registerTwo.toString();
	}
	
	
	
}
