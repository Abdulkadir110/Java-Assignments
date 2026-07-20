/** Start
* import Scanner from the library;
* Prompt the user to collect input for number
* initialize the number variable. 
* if the number is divisible by 5, print Buzz.
* else if the number is divisible by 3, print Fizz.
* else if the number is divisible by both or the number itself, print FizzBuzz
* else print FizzBuzz

End */


import java.util.Scanner;
	public class BuzzFizz{
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your number: ");
			int number = input.nextInt();
						
	if ( number % 5 == 0)	{
		System.out.println("Buzzzzzzz");
	}
	else if (number % 3 == 0) {
		System.out.println("Fizzzzzzz");
	}
	else if ( number % 5 == 0 && number % 3 == 0 || number % number == 0) {
		System.out.println("FizzBuzz");
	}
	else {
		System.out.println("FizzBuzz");
	}		
	}
}