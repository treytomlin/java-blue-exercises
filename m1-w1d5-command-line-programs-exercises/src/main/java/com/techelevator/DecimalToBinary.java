package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

		public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		    String userInput = in.nextLine();
		    String[] parsedInts = userInput.split(" ");
		    for (int i = 0; i < parsedInts.length; i++) {
		        Integer intArray = Integer.parseInt(parsedInts[i]);
		        String binaryValue = Integer.toBinaryString(intArray);
		        System.out.println(intArray + " in binary is " + binaryValue);
		        
		        //System.out.println(intArray + "in binary is " + Integer.toBinaryString(Integer.parseInt(userInput)));
		    }

		}

	}


