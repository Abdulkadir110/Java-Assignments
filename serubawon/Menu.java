import java.util.Scanner;
public class Menu {
	public static void main (String [] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.print("1 = Deposit\n");
		System.out.print("2 = Withdraw\n");
		System.out.print("3 = Check balance\n");
		System.out.print("4 = Exit\n");
		
		System.out.print("Enter your choice: ");

		int number = input.nextInt();
		int counter = 0;
		do {
		System.out.print("1 = Add\n");
		System.out.print("2 = Substract\n");
		System.out.print("3 = Check balance\n");
		System.out.print("4 = Exit\n");
		
		System.out.print("Enter your choice: ");
		number = input.nextInt();
		counter++;

		}
		while(number != 4); 
		
	}
}