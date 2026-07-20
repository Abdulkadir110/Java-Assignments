//Write a program that prompts the user to enter the number of electricity units consumed 
//and the cost per unit, then displays the total bill.

import java.util.Scanner;
  public class ElectricityBillCalculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of Electricity Units Consumed: ");
		double consumedUnit = input.nextDouble();
		
		System.out.println("Enter the cost per unit: ");
		double costPerUnit = input.nextDouble();

		double totalBill = consumedUnit * costPerUnit;

		System.out.printf("The total bill of consumed Electricity is: %f", totalBill);
	}
}