//Question 2
//Initiate the counter for the integers count should less than or equal to 10
//Declare the user input for the largest
//Collect ten input from the user; 
//Create a condition if smallest is greater than number thus the number is the smallest
// Then continue increasing the counter


import java.util.Scanner;
	
	public class SmallestNumberFromTenIntegers {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
			int counter = 1;

		System.out.print("Enter the integers: ");
		int smallest = input.nextInt(); //change the variable "largest" to smallest
			
			while (counter < 10) {
			System.out.print("Enter the integers: ");
			  int number = input.nextInt(); 
			
				if ( smallest >= number ) {
				smallest = number; //change the largest to smallest

				

				}
				counter++;
				

			}
System.out.printf("The Smallest number is: %d", smallest); // change largest to smallest	
			
		}		

	}


	