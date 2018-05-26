package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Select your Unit of measurement!");
			System.out.print("Enter (M)eters or (F)eet || Enter (Q) to quit) >>>");
			String userUnit = in.nextLine().toUpperCase();
			System.out.println("And how many?");
			System.out.println("Give me an Integer please! >>");

			String userInt = in.nextLine().toUpperCase();
			if(userInt.equals("Q")) {
				break;
			}
				
				switch(userUnit){
				case "M":
					String meterConversion = userInt;
					double result = Integer.parseInt(meterConversion) * 3.28 ;
					System.out.println(userInt + " Meters is " + result + " feet!");
					break;
				case "F":
					String feetConversion = userInt;
					double result2 = Integer.parseInt(feetConversion) * 0.3048 ;
					System.out.println(userInt + " Feet is " + result2 + " Meters!");
					break;
				


			}
	
				

		
			
					
			}
	
		}

}
