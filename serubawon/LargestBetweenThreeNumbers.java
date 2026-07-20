/** Start
* import Scanner;
* prompt the user to collect an integer number,
* collect for the first integer
* collect for the second integer
* collect third integer
* if the the first number is greater than the rest, print first number is the largest.
* else if the the second number is greater than the rest, print second number is the largest
* else if the the third number is greater than the rest, print third number is the largest

End */


import java.util.Scanner;
	public class LargestBetweenThreeNumbers {
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
	
			
			
			System.out.print("Enter the first integer: ");
			int firstInteger = input.nextInt();
			System.out.print("Enter the second integer: ");
			int secondInteger = input.nextInt();
			System.out.print("Enter the third integer: ");
			int thirdInteger = input.nextInt();

		if (firstInteger > secondInteger && firstInteger > thirdInteger)	{
			System.out.printf("The largest is %d", firstInteger);
		}
		else if ( secondInteger > firstInteger &&  thirdInteger > firstInteger)	{
			System.out.printf("The largest is %d", secondInteger);
		}
		else	{
			System.out.printf("The largest is %d", secondInteger);
		}
	}
}		