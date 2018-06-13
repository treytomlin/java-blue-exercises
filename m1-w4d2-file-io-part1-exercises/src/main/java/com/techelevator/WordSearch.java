package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter path to input file");
		String path = in.nextLine();
		File inputFile = new File(path);
		System.out.println("Please enter the word to search");
		String searchWord = in.nextLine();
		int counter = 0;
	
			while(in.hasNextLine()) {
				counter++;
				String line = in.nextLine();
				if(line.contains(searchWord)) {
					System.out.println(counter + ")" +line);
					
				
			} else { 
				in.nextLine();
			}
		}
	

		
		
		
	}	
		
		
}	
		
		
		
		
		
		
