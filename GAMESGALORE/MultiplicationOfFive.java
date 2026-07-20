/*
create a loop that counts from 1 to 12,
then it loops the multiplication of 5 by the counter.
print the multiplicaton table.
**/

public class MultiplicationOfFive {
	public static void main(String[]args)	{
		
		for(int counter = 1; counter <= 12; counter++)	{
			int result = 5 * counter;
	
			System.out.printf("5 x %d = %d%n", counter, result);
		}
	}
}
		