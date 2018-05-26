package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter temperature degrees!");
			System.out.println("How many degrees?");
			String userDegreeUnit = in.nextLine().toUpperCase();
			System.out.print("Enter (C)elcius or (F)erenheit or Q) to quit) >>>");
			System.out.println("Give me an Integer please! >>");

			String userInt = in.nextLine().toUpperCase();
			if(userInt.equals("Q")) {
				break;
			}
				
				switch(userDegreeUnit){
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

	


