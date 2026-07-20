/*
Collect input from the user;
set a loop that counts from 1 to the user input.
if the user input is divisible by the counter 
then, print all the factors of the inputted number;
**/

public class  FactorsOfANumber {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a number to get its factors: ");
		int number = input.nextInt();

		for(int counter = 1; counter <= number; counter++)	{
			
			if( (number % counter) == 0 )	{
				System.out.printf("The factors are: %d%n", counter);
			}	 
		}
	}
}	