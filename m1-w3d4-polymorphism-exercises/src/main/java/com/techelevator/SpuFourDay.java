package com.techelevator;

public class SpuFourDay implements DeliveryDriver {
public double rate;
	@Override
	public double calculateRate(int distance, int weight) {
		rate = (weight * 0.0050) * distance;
		return 0;
	}


		//rate = (weight * 0.0050) * distance;
	
	

}
