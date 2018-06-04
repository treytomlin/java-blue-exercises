package com.techelevator.product;

public class Product {

	private String name = "";
	private double price;
	private double weightInOunces;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getWeightInOunces() {
		return this.weightInOunces;
	}
	
	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
}

