package com.techelevator;

public class DeliveryService {
	protected String name;
	protected double weight;
	protected double distance;
	protected double rate;

	public DeliveryService(String name, double weight, double distance, double rate) {
		this.name = name;
		this.weight = weight;
		this.distance = distance;
		this.rate = rate;
		
	}

	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public double getRate() {
		return rate;
	}
	
	
}
