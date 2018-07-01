package com.techelevator;

public class SpuFourDay implements DeliveryDriver {
	
	public String name = "SPU Four Day Ground";

	public String getName() {
		return name;
	}

	@Override
	public double calculateRate(double distance, double weight) {
		double groundRate = (weight * 5) * distance; double rate = (groundRate / 1000); return rate;
	}

}