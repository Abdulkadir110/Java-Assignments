/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the firstNumber
* Initialize the variable for int firstNumber
* Prompt the user input to collect the secondNumber
* Initialize the variable for int secondNumber
* Decleare a variable for the sum computation
* Decleare a variable for the difference computation
* Decleare a variable for the product computation
* Decleare a variable for the qu0tient computation
* prints the result to out the values calculated on each line.;
  end */

import java.util.Scanner;
	public class SimpleCalculationOfTwoNumbers{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the first Number: ");
			double firstNumber = input.nextDouble();
			
			System.out.print("Enter the second Number: ");
			double secondNumber = input.nextDouble();

			double sum = firstNumber + secondNumber;
			double difference = firstNumber - secondNumber;
			double product = firstNumber * secondNumber;
			double quotient = firstNumber / secondNumber;	


	System.out.printf("The sum of %.3f and %.3f is: %.3f%n", firstNumber, secondNumber, sum);
	System.out.printf("The difference of %.3f and %.3f is: %.3f%n", firstNumber, secondNumber, difference);	
	System.out.printf("The product of %.3f and %.3f is: %.3f%n", firstNumber, secondNumber, product);
	System.out.printf("The quotient of %.3f and %.3f is: %.3f%n", firstNumber, secondNumber, quotient);		
	}
} 