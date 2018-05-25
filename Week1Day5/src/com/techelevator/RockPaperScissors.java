package com.techelevator;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		String[] rps = new String[] { "R", "P", "S" } ;
		Random r = new Random();
		
		int humanWins = 0;
		int computerWins = 0;
		int ties = 0;
		
		Scanner in = new Scanner(System.in);
		while (true) {
				
			
			
			System.out.println("Select (R)ock, (P)aper, (S)cissors, Quit");
			System.out.print("Enter Here>>>");
			String choice = in.nextLine().toUpperCase();
			
			if(choice.equals("Q")) {
			System.out.println("Final Score:");
			System.out.println("Computer:" + computerWins);
			System.out.println("You: " + humanWins);
			System.out.println("Ties: " + ties);
			System.out.println("Thanks for playing!");
				break;
			}
			
			int randomNumber = r.nextInt(3);
			String computerChoice = rps[randomNumber];
			System.out.println("The Computer choose " + computerChoice + "!");
	
			String outcome = "";
			
			switch(choice) {
			case "R":
				switch(computerChoice) {
				case "R":
					ties++;
					outcome = "You Tied!";
					break;
				case "P":
					computerWins++;
					outcome = "The Computer Wins";
					break;
				case "S":
					humanWins++;
					outcome = "You Win!";
					break;
					
				}
				break;
			
			case "P":
				switch(computerChoice) {
				case "R":
					humanWins++;
					outcome = "You Win!";
					break;
				case "P":
					ties++;
					outcome = "You Tied!";
					break;
				case "S":
					computerWins++;
					outcome = "The Computer Wins";
					break;
					
				}
				break;
				
			case "S":
				switch(computerChoice) {
				case "R":
					computerWins++;
					outcome = "The Computer Wins!";
					break;
				case "P":
					humanWins++;
					outcome = "You Win!";
					break;
				case "S":
					ties++;
					outcome = "You Tied!";
					break;
					
				}
				break;
			
			default: 
				outcome = "You didn't make a valid choice!";
				break;
			}
			
			
			System.out.println(outcome);
		}
	}

}
