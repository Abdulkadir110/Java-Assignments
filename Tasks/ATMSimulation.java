import java.util.Scanner;
public class ATMSimulation {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	int deposit = 0;
	int withdraw = 0;
	int balance = 0;
	int counter = 1;
	int withdrawAmount = 0;
	
	do {
	
	System.out.print("Enter your balance(type -1 to terminate): ");
	balance = input.nextInt();

	System.out.print("Do you want to Deposit(1/0): ");
	int option = input.nextInt();
	
	if (option == 1)	{
	System.out.print("Enter your Deposit Amount: ");
	deposit = input.nextInt();

	}
	int newBalance = deposit + balance;
	System.out.printf("You new balance is: $%d%n", newBalance);

	else {
		System.out.print("thank you for your patronage");

	}
	 
		
	System.out.println("Do you want to Withdraw(1/0): ");
	option = input.nextInt();
	
	if (option == 1)	{
	System.out.print("Enter your Withdraw Amount: ");
	withdrawAmount = input.nextInt();
	}
	
	int finalbalance = newBalance - withdrawAmount;
	System.out.printf("You new balance is: $%d%n", finalbalance);

	else {
		System.out.print("thank you for your patronage");

	}
	
	counter++;
	
	System.out.print("thank you for your patronage");
	break;

	}

	while (balance != -1);
		
	}
}


