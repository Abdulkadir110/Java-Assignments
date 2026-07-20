//Question 1
//Initiate the counter for the integers count should less than or equal to 10
//Declare the user input for the largest
//Collect ten input from the user; 
//Create a condition if largest is less than number thus the number is the lergest
// Then continue increasing the counter


import java.util.Scanner;
	
	public class LargestNumberFromTenIntegers {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		 	int count = 1;

			System.out.print("Enter the integers: ");
			
			int largest = input.nextInt();
			
			while (count <= 10) {
				System.out.print("Enter the integers: ");
				int number = input.nextInt();
				
				if ( largest < number) {
				largest = number;
				}
			
				count++;
			}
			System.out.printf("The largest number is: %d", largest);
	}	
		

}


	 