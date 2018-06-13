package com.techelevator;

public  interface DeliveryDriver {
	
	//String getName();
	//double getWeight();
	//double getDistance();
	/***
	 * Calculates rate based on distance and weight.
	 * 
	 * @param distance - The distance in miles.
	 * @param weight - The weight in ounces.
	 * @return
	 */
	double calculateRate(int distance, int weight);

}
