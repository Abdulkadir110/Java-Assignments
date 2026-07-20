/** Start
* import Scanner;
* prompt the user to collect an integer number,
* if the number is a multiple of 2, print even.
* else, print odd.
End */




import java.util.Scanner;
	public class EvenOrOdd {
		public static void main (String [] args)  {
			Scanner input  = new Scanner(System.in)	{
			
			System.out.print("Enter an Integer: ");
			int number = input.nextInt();

			if(number % 2 == 0)	{
				System.out.print("Even");
			}
			else {
				System.out.print("Odd");
		}
	}
			