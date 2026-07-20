//1) State Condition that counts from 1 to 100;
//3) State a condtion that supports if the counter is a mulitple of 2;
//4) print the counter result of the numbers.

public class MultiplesOfTwo {
	public static void main (String[]args) {
			
		for( int counter = 2; counter <=100; counter++)	{
			if(counter % 2 == 0) {
				System.out.printf("The multiples of 2 are: %d\n", counter);
			}
		}
	}
}
