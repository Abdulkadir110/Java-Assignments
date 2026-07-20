/** Start
* use for loop to count the numbers from 1 to 50 
* if the number is divisible by 5, print Buzz.
* else if the number is divisible by 3, print Fizz.
* else if the number is divisible by both or the number itself, print FizzBuzz
* else print FizzBuzz

End */


import java.util.Scanner;
	public class BuzzFizzCalculator{
		public static void main(String[]args)	{

						
	for(int count = 1; count <= 50; count++)	{
		System.out.print(count + ": ");

		if ( count % 5 == 0)	{
		System.out.println("Buzzzzzzz");
		}
		else if (count % 3 == 0) {
		System.out.println("Fizzzzzzz");
		}
		else if ( count % 5 == 0 && count % 3 == 0 || count % count == 0) {
		System.out.println("FizzBuzz");
		}
		else {
		System.out.println("FizzBuzz");
		}
	}			
	}
}