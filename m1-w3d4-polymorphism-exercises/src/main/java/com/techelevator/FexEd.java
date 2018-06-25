package com.techelevator;

public class FexEd implements DeliveryDriver {
public double rate = 20.00;
	@Override
	public double calculateRate(int distance, int weight) {
		if( distance > 500) {
			rate += 5.00;
		}
		if(weight > 48) {
			rate += 3.00;
		}
		return rate;
	}

	
		
		
		
//		rate = 20.00
//				if distance > 500 miles then rate = rate + 5.00
//				if weight > 48 ounces then rate = rate + 3.00
//		
//	
		}


