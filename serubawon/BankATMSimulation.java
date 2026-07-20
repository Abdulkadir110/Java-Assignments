import java.util.Scanner;
public class BankATMSimulation {
	public static void main (String [] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.print("1 = Deposit\n");
		System.out.print("2 = Withdraw\n");
		System.out.print("3 = Check balance\n");
		System.out.print("4 = Exit\n");
		
		System.out.print("Enter your choice: ");
		
		int number = input.nextInt();

		int deposit = 0;
		int withdraw = 0;
		int balance = 50000;
		int counter = 0;

		while(number != 4) {
		System.out.print("1 = Deposit\n");
		System.out.print("2 = Withdaw\n");
		System.out.print("3 = Check balance\n");
		System.out.print("4 = Exit\n");
		
		System.out.print("Enter your choice: ");
		number = input.nextInt();

		if (number == 1)	{
		System.out.print("Enter your Deposit Amount: ");
		deposit = input.nextInt();

		}
		int newBalance = deposit + balance;
		System.out.printf("You new balance is: $%d%n", newBalance);

		
		if (number == 2)	{
		System.out.print("Enter your Withdraw Amount: ");
		withdraw = input.nextInt();
		}
	
		final int finalbalance = newBalance - withdraw;
		System.out.printf("You new balance is: $%d%n", finalbalance);

				
		if (number == 3)	{
		System.out.print("Your balance is: " + balance);
		counter++;

		}
		
		}
	}
}