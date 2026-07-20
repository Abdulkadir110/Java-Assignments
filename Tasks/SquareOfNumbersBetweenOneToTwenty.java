//1) State Condtion that counts from 1 to 20;
//2) print the counter result when you square them.


public class SquareOfNumbersBetweenOneToTwenty {
	public static void main (String[]args) {
			
		for( int counter = 1; counter <=20; counter++)	{
			
		   System.out.printf("The square of %d is: %d\n", counter, (counter * counter));
			
		}
	}
}
