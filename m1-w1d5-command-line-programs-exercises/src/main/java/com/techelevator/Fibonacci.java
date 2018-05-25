package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		int[] fibNumbers = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987};
		
		Scanner in = new Scanner(System.in);
		while (true){
			
			System.out.println("If you give me an integer, i'll give you the fibonacci sequence leading up to it! or Q to quit");
			System.out.print("Enter Here>>>");
			String userInt = in.nextLine().toUpperCase();
			if(userInt.equals("Q")) {
				break;
			}
			String fibSequenceResponse = "";
			
			switch(userInt){
			case "0":
				fibSequenceResponse = "Try a different number, the sequence begins at 0!";
				break;
			case "1":
				fibSequenceResponse = "0, 1 ";
				break;
			case "2":
				fibSequenceResponse = "0, 1, 1 ";
				break;
			case "3":
				fibSequenceResponse = "0, 1, 1, 2 ";
				break;
			case "4":
				fibSequenceResponse = "0, 1, 1, 2, 3 ";
				break;
			case "5":
				fibSequenceResponse = "0, 1, 1, 2, 3 ";
				break;
			case "6":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5 ";
				break;
			case "7":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, ";
				break;
			case "8":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5 ";
				break;
			case "9":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, ";
				break;
			case "10":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8 ";
				break;
			case "11":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8 ";
				break;
			case "12":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8 ";
				break;
			case "13":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8 ";
				break;
			case "14":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "15":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "16":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "17":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "18":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "19":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "20":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "21":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13 ";
				break;
			case "22":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13, 21 ";
				break;
			case "23":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13, 21 ";
				break;
			case "24":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13, 21 ";
				break;
			case "25":
				fibSequenceResponse = "0, 1, 1, 2, 3, 5, 8, 13, 21 ";
				break;
		default: 
				fibSequenceResponse = "I'd have to write some more code for that! ;) ";
				break;
			}
	
	
			
			System.out.println(fibSequenceResponse);
	
					
			}
	
		}

}

