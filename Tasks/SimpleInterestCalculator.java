// Write a program that prompts the user to enter the principal, rate, and time, then //displays the simple interest and total amount. 

import java.util.Scanner;
  public class SimpleInterestCalculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount: ");
		double Principal = input.nextDouble();
		
		System.out.println("Enter the Rate: ");
		double Rate = input.nextDouble();
		
		System.out.println("Enter the Time: ");
		double Time = input.nextDouble();
	
	
		double SimpleInterest = (Principal * Rate * Time)/100;
		double TotalAmount = SimpleInterest + Principal;

		System.out.printf("The Simple interest of the amount is: %f%n And The total Amount is: %f", SimpleInterest, TotalAmount);
	}
}
