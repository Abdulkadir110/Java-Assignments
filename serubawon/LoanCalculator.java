/** Start
* declare initial balance and assign 5000.00 to it
* declare deposit and assign 1200.50 to it
* declare withdraw and assign 750.20 to it
* declare interest and calculate for the interest.
* declare final balance and assign the addition of initial balance and inteest balance
End */



public class LoanCalculator	{
		public static void main (String[]args)	{
			double initalBalance = 5000.00;
			
			double deposit = 1200.50;
			
			double withdraw = 750.25;
			
			double interestBalance = ((initialBalance + deposit) - withdraw ) * 0.015;
			double finalBalance = initalBalance + interestBalance;

			System.out.printf("The final balance is: %.2f", finalBalance);
		}
}