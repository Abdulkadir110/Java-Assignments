/*Pseudocode;
initialize the sum of the digits to be zero
then collect input for the number
state a condition that says if the number is between 0 and 1000; it should seperate the digits and assign their addition into the variable of the sum of the digits.
then print out the result.

*/


import java.util.Scanner;
	public class SumTheDigitsInAnInteger {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
			int sumOfTheDigits = 0;
			System.out.print("Enter a number between 0 and 1000: ");
			int number = input.nextInt();
			

			if (number > 0 && number < 1000 ) {
				int firstDigit = number % 1000/100;
				int secondDigit = number % 100/10;
				int thirdDigit = number % 10;
				
				sumOfTheDigits = firstDigit + secondDigit + thirdDigit;
			}
			   System.out.printf("The sum of the digits is: %d", sumOfTheDigits);
			
		}
	}