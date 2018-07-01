package com.techelevator;

public class FexEd implements DeliveryDriver {

	public String name = "FexEx Flat Rate";

	public String getName() {
		return name;
	}

	@Override
	public double calculateRate(double distance, double weight) {
		double Rate = 20.00;
			if (distance > 500 && weight < 48) {double rateDist = (Rate + 5.00);return rateDist;}
			else if (distance < 500 && weight > 48) {double rateOz = (Rate + 3.00);return rateOz;}
			else if (distance > 500 && weight > 48) {double rateDistOz = (Rate + 5.00 + 3.00);return rateDistOz;}
			else	 return Rate;

	}

}