package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {

		File fizzBuzz = new File("FizzBuzz");
		String outputToFile;

		try (PrintWriter fizzBuzzWriter = new PrintWriter(fizzBuzz)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 15 == 0 || (Integer.toString(i).contains("3")) && (Integer.toString(i).contains("5"))) {
					outputToFile = "FizzBuzz";
				} else if (i % 5 == 0 || (Integer.toString(i).contains("5"))) {
					outputToFile = "Buzz";
				} else if (i % 3 == 0 || (Integer.toString(i).contains("3"))) {
					outputToFile = "Fizz";
				} else {
					outputToFile = Integer.toString(i);
				}
				fizzBuzzWriter.print(outputToFile);

			}

		} catch (FileNotFoundException e) {
			System.out.println("");
			System.exit(1);
		}

	}

}