import java.util.Scanner;
public class FactorsOfPositiveIntegers {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your integer: ");
		int number = input.nextInt();
		
		int counter = 1;
		while ( counter <= number) {
			if(number % counter == 0) {		
				System.out.print(counter + " ");
			}
		counter++;
		}
	}
}