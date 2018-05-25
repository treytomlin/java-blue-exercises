package com.techelevator;

public class ArgumentExample {

	public static void main(String[] args) {
		switch(args[0]) {
		case "add":
			System.out.println("This is an Add");
			break;
		case "pull":
			System.out.println("This is a pull");
			break;
		case "commit":
			System.out.println("This is a commit");
			break;
		default:
			break;
		}
		
	}

}
