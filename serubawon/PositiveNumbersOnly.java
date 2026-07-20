import java.util.Scanner;
public class PositiveNumbersOnly {
	public static void main (String [] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");

		int counter = input.nextInt();
		int number;
	
		do {
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		
		counter++;
		}
		while(number != 0); 
		
	}
}