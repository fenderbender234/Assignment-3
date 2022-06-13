import java.util.*;
/*
 * Josh Freeman
 */

public class GreatestAndLeast {
	
	public static void main(String[] args) {
		
		// Create Scanner for user input
		Scanner keyboard = new Scanner(System.in);
		
		// Instantiate variables to store values for num, largest, smallest, and count
		int num = 0;
		int largest = 0;
		int smallest = 0;
		int count = 0;
		
		// When -99 is input, exit the program
		while(num != -99) {
			
			try {
				
				// Get positive integer from user
				System.out.println("Enter a positive integer number.  Enter -99 to stop input.");
				
				// Convert to an integer
				String str = keyboard.nextLine();
				num = Integer.parseInt(str);
				
				// If the number is negative
				if(num < 0 && num != -99) {
					
					System.out.println("ERROR: negative integers other than -99 are not allowed.");
				}
				
				// If the number is positive
				else{
					
					// If user didn't enter any number
					if(count == 0 && num == -99) {
						
						System.out.println("No numbers were entered");
						break;
					}
					
					// Set smallest and largest variables to be the first number
					if (count == 0) {
						
						smallest = num;
						largest = num;
					}
					
					else if(num >= 0) {
						
						// If number is greater than largest, set new number to == largest
						if(num > largest) {
							
							largest = num;
						}
						
						// If number is smaller than smallest, set new number to == smallest
						if (num < smallest) {
							
							smallest = num;
						}
					}
					
					// count add 1
					count++;
				}
			}
			
			// If user didn't input an integer
			catch(Exception e) {
				
				System.out.println("No numbers were entered");
			}
		}
		
		// If there was no user input / exit program
		System.out.printf("The largest integer is: %d and the smallest integer is: %d ",largest,smallest);

        keyboard.close();
	}

}