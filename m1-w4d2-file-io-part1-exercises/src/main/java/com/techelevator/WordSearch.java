package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
		File scanFile = getInputFileFromUser();
		String wordToSearch = getSearchWordFromUser();
		
		try(Scanner fileReader = new Scanner(scanFile)){
		int counter = 0;
	
			while(fileReader.hasNextLine()) {
				counter++;
				String line = fileReader.nextLine();
				if(line.contains(wordToSearch)) {
					System.out.println(counter + ")" +line);
					
				
			} else { 
				 line = fileReader.nextLine();
				 if(line.contains(wordToSearch)) {
					 System.out.println(counter + ")" + line);
				 }
			}
			}
	}
			}

		
		
		
		
	
	

public static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the path of the file to scan");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if( !inputFile.exists() ) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
			
		} else if (!inputFile.isFile() ) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		//userInput.close();
		return inputFile;
	}

	

public static String getSearchWordFromUser() {
	Scanner searchWordReader = new Scanner(System.in);

	System.out.println("Please enter the word to search");
	String searchWord = searchWordReader.nextLine();
	//searchWordReader.close();
	return searchWord;
}
}		

		
		
		
		
		
		
