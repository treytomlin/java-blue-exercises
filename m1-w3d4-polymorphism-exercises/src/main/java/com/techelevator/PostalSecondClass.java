package com.techelevator;


	public class PostalSecondClass implements DeliveryDriver {

		public String name = "Postal Service 2nd Class";
			
			
			public String getName() {
				return name;
			}


			@Override
			public double calculateRate(double distance, double weight) {
				
				double perMileRate = 0;
				if (weight <= 2) perMileRate = 35;
				else if (weight <= 8) perMileRate = 40;	
				else if (weight <= 15) perMileRate = 47;
				else if (weight <= 48) perMileRate = 195;
				else if (weight <= 128) perMileRate = 450;
				else  perMileRate = 500;
				
				double rate = (perMileRate * distance) / 10000;
				return rate;
				
			}
			
			

			
			
		}