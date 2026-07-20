//Question 6
//Initiate the counter for the integers count should less than or equal to 10
//Declare the user input for the largest
//Collect ten input from the user; 
//Create a condition if largest is less than the number thus the number is the largest
//Create a condition if number is less than the largest thus the second Largest is the //number
//calculate for average and print it

import java.util.Scanner;
	
	public class AverageOfTenIntegers {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
			int counter = 1;
			
		
			System.out.print("Enter the integers: ");
			int number = input.nextInt();
			System.out.print("Enter the integers: ");
			int secondlargest = input.nextInt();
			System.out.print("Enter the integers: ");
			int largest = input.nextInt();
						
			while (counter <= 7) { 		
			System.out.print("Enter the integers: ");
			  number = input.nextInt();
				
				if ( largest <= number ) {
				largest = number;
					

				}
				
				if (number < largest) {
				secondlargest = number;
				}

				counter++;

				
			}
		int average = counter / 10;
			
		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The Second-largest number is: %d%n", secondlargest);
		System.out.printf("The Average number is: %d%n", average);
			
		}		

	}


	