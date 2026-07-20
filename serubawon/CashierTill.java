/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the price
* Initialize the variable for double price
* Prompt the user input to collect the quantity
* Initialize the variable for double quantity
* Declare the variable to calculate subtotal = price x quantity
* Declare the variable to calculate VAT = subtotal * 0.2;
* Declare the variable to calculate grandTotal = subtotal * VAT;
* prints the grand total;
  end */

import java.util.Scanner;
	public class CashierTill{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the price: $");
			double price = input.nextDouble();
			System.out.print("Enter the quantity: ");
			double quantity = input.nextDouble();
			
			
			double subtotal = price * quantity;
			double VAT = subtotal * 0.2;
			double grandTotal = subtotal + VAT;
			
			System.out.printf("The grand total is: $%.2f", grandTotal);
	}
} 