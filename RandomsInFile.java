import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
/*
 * Josh Freeman
 */

public class RandomsInFile {
	
	public static void main(String[] args) {
		
		// scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		// setting up for random numbers
		Random rand = new Random();
		
		// on/off switches for the loops
		boolean goMax = true;
		boolean goMin = true;
		
		// declaring min and max variables for random integer range
		int min = 0;
		int max = 0;
		
		// while goMax = true
		while(goMax) {
			
			try {
				
				// Ask the user to input a positive integer, then convert user input to an integer
				System.out.println("Enter the maximum value as a positive integer: ");
				String str1 = keyboard.nextLine();
				max = Integer.parseInt(str1);
				
				// if max is positive, go next
				if(max > 0) {
					
					goMax = false;
				}
				
				// if max is <= 0
				else {
					
					System.out.println("Input ERROR. Number entered was not positive");
				}
			}
			
			// if value wasn't an integer
			catch(Exception e) {
				
				System.out.println("Input ERROR.  Number entered was not an integer");
			}
		}
		
		while(goMin) {
			
			try {
				
				// Ask the user to input a positive integer, then convert user input to an integer
				System.out.println("Enter the minimum value as a positive integer: ");
				String str2 = keyboard.nextLine();
				min = Integer.parseInt(str2);
				
				// if min is positive, go next
				if(min > 0) {
					
					goMin = false;
				}
				
				// if minimum <= 0
				else {
					
					System.out.println("Input ERROR. Number entered was not positive");
				}
			}
			
			// if value wasn't an integer
			catch(Exception e) {
				
				System.out.println("Input ERROR. Number entered was not an integer");
			}
		}
		
		// if min is greater than max, swap
		if(min > max) {
			
			int temp = max;
			max = min;
			min = temp;
		}
		
		// get file location from user
		System.out.println("Enter the filename to write into: ");
		
		// store user's answer in this variable
		String fileName = keyboard.nextLine();
		
		// create file with the user input name
		File file = new File(fileName);
		
		// if file exists, display overwrite message
		if(file.exists()) {
			
			System.out.println("File " + fileName + " already exists.  Overwriting contents");
		}
		
		// variable stores random numbers
		int randomNumber;
		
		try {
			
			// make new printwriter
			PrintWriter outputFile = new PrintWriter(file);
			
			// loop runs 100 times to write numbers to document
			for (int i = 0; i < 100; i++) {
				
				// Picks a random number between the 2 values the user input
				randomNumber = (int) (rand.nextInt((int) ((max - min) + 1)) + min);
				
				// write number down on separate line
				outputFile.println(randomNumber);
			}
			
			// close the file
			outputFile.close();
			
			// output message for user, data written to file
			System.out.println("Data written to the file.");
		}
		
		// if there is an error
		catch(IOException e) {
			
			// output the error
			System.out.printf("ERROR writing to file %s! ", fileName);
			System.out.printf("ERROR MESSAGE: %s!\n", e.getMessage());
		}

        keyboard.close();
	}

}