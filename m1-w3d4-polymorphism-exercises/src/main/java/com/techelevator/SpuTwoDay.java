package com.techelevator;

public class SpuTwoDay implements DeliveryDriver {
public double rate;
	@Override
	public double calculateRate(int distance, int weight) {
		rate = (weight * 0.050) * distance;
		return rate;
	}

}
