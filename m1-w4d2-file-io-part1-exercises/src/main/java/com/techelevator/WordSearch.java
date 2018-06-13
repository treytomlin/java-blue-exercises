package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/***
 * 
 * @author ttomlin
 *
 */


public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
		
		File scanFile = getInputFileFromUser();
		String wordToSearch = getSearchWordFromUser();
		askUserIfCaseSensitive(scanFile, wordToSearch);
}

@SuppressWarnings("resource")
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
		
		return inputFile;
	}

	

@SuppressWarnings("resource")
public static String getSearchWordFromUser() {
	Scanner searchWordReader = new Scanner(System.in);

	System.out.println("Please enter the word to search");
	String searchWord = searchWordReader.nextLine();
	return searchWord;
}


public static String askUserIfCaseSensitive(File scanFile, String wordToSearch) throws FileNotFoundException {
		
		Scanner caseSensitiveScanner = new Scanner(System.in);
		System.out.println("Do you want the search to be case sensitive? (Y)es or (N)o ");
		String caseOrNot = caseSensitiveScanner.nextLine().toLowerCase().substring(0, 1);
		
		try(Scanner fileReader = new Scanner(scanFile)){
			int counter = 0;
		
				while(fileReader.hasNextLine()) {
					
				if(caseOrNot.equals("Y")){
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
							 
					
		
		
				} else {
					counter++;
					String line = fileReader.nextLine();
					if(line.toLowerCase().contains(wordToSearch.toLowerCase())) {
						System.out.println(counter + ")" +line);
					} else { 
						line = fileReader.nextLine();
						 if(line.toLowerCase().contains(wordToSearch.toLowerCase())) {
							 System.out.println(counter + ")" + line);
								caseSensitiveScanner.close();

						 }
					}
				}
		
		
	
				}
		}
		return "";
}
}		

		
		
		
		
		
		
