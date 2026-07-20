/**
* Import Scanner
* prompt to collect the first number
* prompt to cllect the second number
* if the first number > second number, the firstnumber is larger and secondnumber is smaller
* else if the second number > first number, the second number is larger and firstnumber is smaller
* else first number == second number

End */

import java.util.Scanner;
	public class LargerAndSmallerNumber {
		public static void main (String [] args)  {
			Scanner input  = new Scanner(System.in);
			
			System.out.print("Enter your first Integer: ");
			int firstNumber = input.nextInt();
			System.out.print("Enter your second Integer: ");
			int secondNumber = input.nextInt();

			if(firstNumber > secondNumber )	{
				System.out.printf("The larger number is %d%n", firstNumber);
				System.out.printf("The smaller number is %d", secondNumber);

			} else if( secondNumber > firstNumber)	{
				System.out.printf("The larger number is %d%n", secondNumber);
				System.out.printf("The smaller number is %d%n", firstNumber);
			}
			 else if ( firstNumber == secondNumber) {
			System.out.printf("The first number (%d) is equal to the second number  (%d)", firstNumber, secondNumber);
		}	}
	}
