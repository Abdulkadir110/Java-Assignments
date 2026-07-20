/** Pseudocode
initialize the variable the number;
assign the inputted number in to the variable
state a condton that determines if the number is five digits integer or not
state a condition that says that if the first digit is equal to the last digit and the second digit is equal to the fourth digit, then the number is palindrome.
else the number is not palindrome.
*/


import java.util.Scanner;
public class Palindromes {	
	public static void main (String[] args) {
	   Scanner input = new Scanner(System.in);
		int fiveDigitsNumber = 0;

		System.out.print("Enter your five Digits Number: ");
		fiveDigitsNumber = input.nextInt();

	    if (fiveDigitsNumber >= 10000 && fiveDigitsNumber <= 99999 ) {

		if (fiveDigitsNumber / 10000 == fiveDigitsNumber % 10){

			if( (fiveDigitsNumber / 1000) % 10 == (fiveDigitsNumber/10) % 10){

  				System.out.print("The number is a palindrome number");
			}
		
		} 
		else {
		  System.out.println("The number is not a palindrome number");
		}
	   }
	   else {
		System.out.println("ERROR!!! The number is not a five digits number");
	  }
	
	}
}