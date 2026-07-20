/** Start
* import Scanner from the library;
* Prompt the user to collect input for first number
* initialize the first number variable. 
* Prompt the user to collect input for second number
* initialize the second number variable. 
* declare sum variable
* declare product variable
* declare difference variable
* if both numbers > 0, add both numbers
* else if both numbers < 0, multiply both
* else if numbers are difference in signs , minus the smallest from the largest.

 
End */


import java.util.Scanner;
	public class SumPositiveProductNegative{
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your first number: ");
			int firstNumber = input.nextInt();
			System.out.print("Enter your second number: ");
			int secondNumber = input.nextInt();

			int sum = 0;
			int product = 0;
			int difference = 0;
			
			
	if ( firstNumber > 0 && secondNumber > 0)	{
		sum = firstNumber + secondNumber;
		System.out.printf("the sum between %d and %d is: %d%n", firstNumber, secondNumber, sum);

	}
	else if ( firstNumber < 0 && secondNumber < 0)	{
		product = firstNumber * secondNumber; 
		System.out.printf("the product between %d and %d is: %d%n", firstNumber, secondNumber, product);

	}

	if ( firstNumber < 0 && secondNumber > 0 || firstNumber > 0 && secondNumber < 0) {

		if(firstNumber > secondNumber) {
			difference = firstNumber - secondNumber;
		System.out.printf("the difference between %d and %d is: %d%n", firstNumber, secondNumber, difference);
		}

		else {
			difference = secondNumber - firstNumber;
		System.out.printf("the difference between %d and %d is: %d%n", secondNumber ,firstNumber, difference);

		}
	}	
		
	}
}