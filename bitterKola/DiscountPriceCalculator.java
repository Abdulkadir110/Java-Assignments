/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the price
* Initialize the variable for double price
* Prompt the user input to collect the discount percentage
* Initialize the variable for double discount percentage
* Declare the variable to calculate discount amount = price * discount percentage
* Declare the variable to calculate total = price + discount amount;
* prints the total;
  end */

import java.util.Scanner;
	public class DiscountPriceCalculator{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the price: $");
			double price = input.nextDouble();
			System.out.print("Enter the discount percentage: % ");
			double discountPercentage = input.nextDouble();
			
			
			double discountAmount = price * (discountPercentage/100);
			double finalPrice = price + discountAmount;
			
			System.out.printf("The final price is: $%.2f", finalPrice);
	}
} 