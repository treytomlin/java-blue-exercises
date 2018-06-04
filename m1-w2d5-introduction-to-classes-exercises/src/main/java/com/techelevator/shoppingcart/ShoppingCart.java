package com.techelevator.shoppingcart;

public class ShoppingCart {
	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;
	
	
	public int getTotalNumberOfItems() {
		return this.totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return this.totalAmountOwed;
	}
	
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
	
	public double getAveragePricePerItem() {
	// returns the result of totalAmountOwed / totalNumberOfItems.
		
		double newTotal = Math.abs(totalAmountOwed)/ Math.abs(totalNumberOfItems);
		if(this.totalNumberOfItems == 0) {
			return 0.00;
		}
		return newTotal;
		
		
	}
	
	
	public void addItems(int numberOfItems, double pricePerItem) {
	//updates totalNumberOfItems and increases totalAmountOwed by (pricePerItem * numberOfItems)
		
		this.totalNumberOfItems = this.totalNumberOfItems + numberOfItems;
		this.totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);
	}
	
	
	public void empty() {
	//resets totalNumberOfItems to 0 and totalAmountOwed to 0.0.
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
		
	}
}
