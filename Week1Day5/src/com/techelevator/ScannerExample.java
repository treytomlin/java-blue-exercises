package com.techelevator;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter some text:");
		String input = in.nextLine();
		System.out.println(input);
		
		System.out.print("Enter an Integer:");
		
		int myInt = in.nextInt();
			in.nextLine();
		System.out.println(myInt);
		
		System.out.print("Enter a Double:");
		String myDouble = in.nextLine();
		double amount = Double.parseDouble(myDouble);
		double total = 10.0 + amount;
		System.out.printf("Your total is: %10.4f", + total);
				
	}

}
