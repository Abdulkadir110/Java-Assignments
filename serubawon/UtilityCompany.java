import java.util.Scanner;
	public class UtilityCompany {
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number of units: $");
			int numberOfUnits = input.nextInt();


		
		if (numberOfUnits <= 100) {
			System.out.print("The bill is $50/unit");
		} 
		else if (numberOfUnits <= 300)	{
			System.out.print("The bill is $75/unit");
		}
		else {
			System.out.print("The bill is $100/unit");
		}
	}
}
