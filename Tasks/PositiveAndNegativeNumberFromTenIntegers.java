//Question 3
//Initiate the counter for the integers count should less than or equal to 10
//Declare the user input for the largest
//Collect ten input from the user; 
// Create a counter to count the number of positive Number for the loop
// Create a counter to count the number of negative number for the loop
//Create a condition if the number is greater than zero thus the positive number counter //should increase
//Create a condition if the number is less than zero thus the negative number counter //should increase
//Create a condition if largest is less than the number thus the number is the largest
//Create a condition if smallest is greater than number thus the number is the smallest
// Then continue increasing the loop counter.


import java.util.Scanner;
	
	public class PositiveAndNegativeNumberFromTenIntegers {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
			int counter = 1;
			int positiveCounter = 0; // new variable
			int negativeCounter = 0; // new variable

			System.out.print("Enter the integers: ");
			int smallest = input.nextInt();
			System.out.print("Enter the integers: ");
			int largest = input.nextInt();
			int number = input.nextInt();

			
			while (counter <= 8) { // I am putting 8 because, two input has beeen collected before the loop begins
							
				if ( number > 0 ) {
					positiveCounter++;
			
				}
				if ( number < 0 ) {
					negativeCounter++;
			
				}

				
				if ( smallest >= number ) {
				smallest = number;

				

				}
				System.out.print("Enter the integers: ");
			  	number = input.nextInt();
				
				if ( largest <= number ) {
				largest = number;

				

				}
				counter++;
				
			}
		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The Smallest number is: %d%n", smallest);
		System.out.printf("The Positive number counts are: %d%n", positiveCounter);
		System.out.printf("The Negative number counts are: %d%n", negativeCounter);
			
		}		

	}


	