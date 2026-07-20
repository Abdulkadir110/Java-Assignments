/*
collect input from the user;

create a while loop that as fas as the user input a positive it goes in to the loop
in the loop , 


**/

public class ReversedDigitsOfPositiveIntegers {
	public static void main(String[] args)	{
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter your integer: ");
		int number = input.nextInt();
		int nextDigit = 0;
		while(number > 0) {
			int digits = number % 10;
			
			nextDigit = digits / 10;

		nextDigit++;		
		}
		System.out.printf("The reversed number is: %d", nextDigit);
	}
}