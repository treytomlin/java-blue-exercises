package com.techelevator;

public class SpuNextDay implements DeliveryDriver {
public double rate;
	@Override
	public double calculateRate(int distance, int weight) {
		rate = (weight * 0.075) * distance;
		return rate;
	}

		//rate = (weight * 0.075) * distance;

}
