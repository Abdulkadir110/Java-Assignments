
import java.util.Scanner;
	public class PersonIncome {
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number: ");
			int income = input.nextInt();
			
		if ( income <= 300000) {
			System.out.print("The tax is 0%");
		}
		else if (income >= 300001 && income < 600000)  {
			System.out.print("The tax is 7%");
		}
		else {
			System.out.print("The tax is 15%");
		}
	}
}