package com.techelevator.staticExample;

public class Register {
	
	public static final String posName = "Register";
	
	private String id;
	private double registerAmount = 0;
	
	public Register(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public double getRegisterAmount() {
		return registerAmount;
	}

	public void makeSale(double amount) {
		this.registerAmount += amount;
		
	}
	
	@Override
	public String toString() {
		return posName + " " + this.id + ": $" + this.registerAmount;
		
	}
	
	
	
	
}
