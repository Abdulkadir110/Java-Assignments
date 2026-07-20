/*
Collect an input integer (n) from the user;
use for loop to count from 1 to the number n, 
initialize index to 2 rate to power of the counts till n.
print the index.
**/

public class IndexOfN {
	public static void main (String [] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		double nNumber = input.nextInt();

		for(int counter = 1; counter <= nNumber; counter++)	{
			
			double index = Math.pow(2, counter);
			System.out.printf("The n powers are: %.1f%n", index);
		}
	}
}