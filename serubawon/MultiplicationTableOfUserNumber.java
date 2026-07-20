import java.util.Scanner;
public class MultiplicationTableOfUserNumber {
	public static void main (String [] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		 int number = input.nextInt();


		 for (int counter = 1; counter <= 12; counter++)	{
			int product = number * counter;
			
			System.out.printf("%d x %d = %d%n", number, counter, product);
			
		}
	}
}