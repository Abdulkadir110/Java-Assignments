/** Start
* import Scanner from the library;
* Declare int fourDigitPin and assign 0 to it
* Prompt the user to collect input for the four -digits Pin
* initialize the four digit pin variable. 
* if fourDigitPin >= 1000 and fourDigitPin <=9999, print valid PIN 
* else the fourDigitPin is invalid PIN
End */


import java.util.Scanner;
public class FourDigitsPin {	
	public static void main (String[] args) {
	   Scanner input = new Scanner(System.in);
		int fourDigitsPin = 0;

		System.out.print("Enter your 4 - Digits Pin: ");
		fourDigitsPin = input.nextInt();

	    if (fourDigitsPin >= 1000 && fourDigitsPin <= 9999 ) {
		 System.out.println("Valid PIN");
	     }
	     else {
		System.out.println("Invalid PIN, try again!");
	  }
	
	}
}