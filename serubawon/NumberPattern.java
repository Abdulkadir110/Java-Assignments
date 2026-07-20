import java.util.Scanner;

public class NumberPattern {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);
	
		for (int count = 1; count <= 20; count++)	{
			System.out.print("Enter the number: ");
			int number = input.nextInt();
			
			if (number >= 1 && number <= 7) {
				System.out.println("Low");
			}
			else if (number >= 8  && number <= 14) {
				System.out.println("Mid");
			}
			else if (number >= 15 && number >= 20) {
				System.out.println("High");
			} 
		}

	}
}
