import java.util.Scanner;
	public class DivisbleByThreeAndFive {
		public static void main (String [] args)  {
			Scanner input  = new Scanner(System.in);
			
			System.out.print("Enter an Integer: ");
			int number = input.nextInt();

			if(number % 3 == 0 && number % 5 == 0)	{
				System.out.print("Divisible by 3 & 5");
			}
			else if(number % 3 == 0 )	{
				System.out.print("Divisible by 3 only");
			}
			else if(number % 5 == 0)	{
				System.out.print("Divisible by 5 only");
			}
			else {
				System.out.print("Divisible by neither");
			}
		}
	}
