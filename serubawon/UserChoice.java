import java.util.Scanner;
public class UserChoice {
	public static void main (String [] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.print("1 = Add\n");
		System.out.print("2 = Substract\n");
		System.out.print("3 = Exit\n");

		System.out.print("Enter your choice: ");

		int number = input.nextInt();
		int counter = 0;
		do {
		System.out.print("1 = Add\n");
		System.out.print("2 = Substract\n");
		System.out.print("3 = Exit\n");
		
		System.out.print("Enter your choice: ");
		number = input.nextInt();
		counter++;
		}
		while(number != 3); 
		
	}
}