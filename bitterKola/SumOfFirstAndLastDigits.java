/** Start
* import Scanner;
* Prompt the user to collect input for a five digits number
* initialize the number variable. 
* declare the first digit variable and assign (number % 10) to it
* declare the seond digit variable and assign ((number/10) % 10) to it
* declare the third digit variable and assign ((number/100) % 10) to it
* declare the forth digit variable and assign ((number/1000) % 10) to it
* declare the fifth digit variable and assign ((number/10000) % 10) to it
* declare the sum of the first and last digit of the number.
* Display the result of the sum.
End */


import java.util.Scanner;
	public class SumOfFirstAndLastDigits	{
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your five Digit Number: ");
			int number = input.nextInt();
			
			int firstDigit = number % 10;
			int secondDigit = (number/10) % 10;
			int thirdDigit = (number/100) % 10;
			int fourthDigit = (number/1000) % 10;
			int fifthDigit = (number/10000) % 10;

			int sum = firstDigit + fifthDigit;
		
	System.out.printf("The sum of the first digit (%d) and last digit (%d) of your number is: %d", firstDigit, fifthDigit, sum);
	}
}