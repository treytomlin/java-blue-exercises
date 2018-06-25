package com.techelevator;

import java.math.BigDecimal;

public class PostalThirdClass implements DeliveryDriver {
public double rate;
	@Override
	public double calculateRate(int distance, int weight) {
		if(weight >= 0 && weight <=2){
			BigDecimal bd = new BigDecimal(0.035 * distance);
			bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
			rate = bd.doubleValue();
		}
		if(weight >= 3 && weight <= 8) {
			rate = 0.040 * distance;
		}
		if(weight >= 9 && weight <= 15) {
			BigDecimal bd = new BigDecimal(0.047 * distance);
			bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
			rate = bd.doubleValue();
		}		
		return rate;
	}
	
	
}
