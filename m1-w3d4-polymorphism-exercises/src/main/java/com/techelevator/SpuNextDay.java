package com.techelevator;

	public class SpuNextDay implements DeliveryDriver {
		
		public String name = "SPU Next Day";

		public String getName() {
			return name;
		}

		@Override
		public double calculateRate(double distance, double weight) {
			double nextRate = (weight * 75) * distance; double rate = (nextRate / 1000); return rate;
		}

	}
