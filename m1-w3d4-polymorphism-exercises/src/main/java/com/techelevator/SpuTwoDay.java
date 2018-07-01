package com.techelevator;

	public class SpuTwoDay implements DeliveryDriver {

		
		public String name = "SPU Two Day Business";

		public String getName() {
			return name;
		}
		
		@Override
		public double calculateRate(double distance, double weight) {
			double busRate = (weight * 5) * distance; double rate = (busRate / 1000); return rate;
		}
	}
