/** Start
* import Scanner from the library;
* Prompt the user to collect input for first number
* initialize the first number variable. 
* Prompt the user to collect input for second number
* initialize the second number variable. 
* if firstNumber is multiple of secondnumber, prints it is a multiple
* else it is not a multiple

End */


import java.util.Scanner;
	public class Multiples{
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your first number: ");
			int firstNumber = input.nextInt();
			System.out.print("Enter your second number: ");
			int secondNumber = input.nextInt();
			
	if ( firstNumber % secondNumber == 0)	{
		System.out.printf("%d is a multiple of %d", firstNumber, secondNumber);
	}
	else {
		System.out.printf("%d is not a multiple of %d", firstNumber, secondNumber);
	}		
	}
}