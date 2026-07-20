//1) State Condtion that counts from 1 to 10;
//2) print the counter result when you cube them.


public class CubeOfNumbersBetweenOneToTen {
	public static void main (String[]args) {
			
		for( int counter = 1; counter <=10; counter++)	{
			
		   System.out.printf("The cube of %d is: %d\n", counter, (counter * counter * counter));
			
		}
	}
}
