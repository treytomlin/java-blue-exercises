package com.techelevator;


public class KataPotter {

	public double getCost(int[] books) {
		double costOfBooks = 0.00;
		
		for(int book : books) {
			costOfBooks += 8.00 * book;
		}
		if(costOfBooks >= 16.00) {
			costOfBooks -= costOfBooks * 0.05;
		}
		return costOfBooks;
		
	
	}
}




////Create an array with room for 100 integers
//int[] nums = new int[100];
//
////Fill it with numbers using a for-loop
//for (int i = 0; i < nums.length; i++)
// nums[i] = i + 1;  // +1 since we want 1-100 and not 0-99
//
////Compute sum
//int sum = 0;
//for (int n : nums)
// sum += n;
//
////Print the result (5050)
//System.out.println(sum);