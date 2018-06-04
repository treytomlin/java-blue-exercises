package com.techelevator.staticExample;

public class storeDemo {
	public static void main(String[] args) {
		
		Store store = new Store();
		Store storeTwo = new Store();
		
		System.out.println("Customer buys an item at Register One for $10.00");
		store.makeSaleRegisterOne(10d);
		System.out.println(store);
		
		
		System.out.println("Customer buys an item at Register Two for $12.50");
		store.makeSaleRegisterTwo(12.5d);
		System.out.println(store);
		
		System.out.println("Customer buys an item at Register One for $5.25");
		storeTwo.makeSaleRegisterOne(5.25d);
		System.out.println(storeTwo);
		
		
		System.out.println("Customer buys an item at Register Two for $30.50");
		storeTwo.makeSaleRegisterTwo(30.5d);
		System.out.println(storeTwo);
		
		System.out.println();
		System.out.println("Final Total:" + Store.getTotalAmount());
		
	}

}
