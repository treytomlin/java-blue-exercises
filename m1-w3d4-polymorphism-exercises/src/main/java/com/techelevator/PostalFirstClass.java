package com.techelevator;

import java.math.BigDecimal;

public class PostalFirstClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, int weight) {
		if(weight >= 0 && weight <=2){
			BigDecimal bd = new BigDecimal(0.035 * distance);
			bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
			return bd.doubleValue();
		}
		if(weight >= 3 && weight <= 8) {
			return 0.040 * distance;
		}
		if(weight >= 9 && weight <= 15) {
			BigDecimal bd = new BigDecimal(0.047 * distance);
			bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
			return bd.doubleValue();
		}
		return 0;
	}
	
//	if(weight >= 1 && weight <= 3) {
//		BigDecimal bd  = new BigDecimal(0.195 * distance;)
//		bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
//		return bd.doubleValue();
//	}
}
