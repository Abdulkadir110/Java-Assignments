// Write a program that prompts the user to enter hours worked, hourly rate, bonus, and tax 
// rate, then displays the gross pay, tax amount, and net pay.

import java.util.Scanner;
  public class PayrollCalculation {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Hours you've worked for: ");
		double hoursWorked = input.nextDouble();
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter your bonus: ");
		double bonus = input.nextDouble();
		
		System.out.println("Enter your tax rate: ");
		double taxRate = input.nextDouble();
		
		double grossPay = (hourlyRate * hoursWorked) + bonus;
		double taxAmount = grossPay * (taxRate/100);
		double netPay = grossPay - taxAmount;
	
		System.out.printf("Your Gross Pay is: %f\nYour tax Amount is: %f\nYour net Pay is: %f", grossPay, taxAmount, netPay);
	}
}
		
		