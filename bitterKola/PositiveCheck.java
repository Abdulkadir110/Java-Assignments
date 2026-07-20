/** Start
* import Scanner;
* prompt the user to collect an integer number,
* if the number is greater than zero, print positive.
End */


import java.util.Scanner;
	public class PositiveCheck {
		public static void main (String [] args)  {
			Scanner input  = new Scanner(System.in)	{
			
			System.out.print("Enter an Integer: ");
			int number = input.nextInt();

			if(number > 0)	{
				System.out.print("Positive")
			}
		}
	}
			