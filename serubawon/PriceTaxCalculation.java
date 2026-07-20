/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the price
* Initialize the variable for double price
* Declare the variable to calculate tax = price x 0.075
* Declare the variable to calculate total = price + tax;
* prints the result of the total;
  end */

import java.util.Scanner;
	public class PriceTaxCalculation{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the price: $");
			double price = input.nextDouble();
			
			double tax = price * 0.075;
			double total = price + tax;
			
			System.out.printf("The total is: $%.2f", total);
	}
} 