//State a condition that counts from 1 to 100;
// if the result of the modulus of the counter is equal to 1;
//print the result.
public class OddNumberFromOneToHundred {
	public static void main (String[]args) {
			
		for( int counter = 1; counter <=100; counter++)	{
			if(counter % 2 == 1) {
				System.out.printf("The numbers are: %d\n", counter);
			}
		}
	}
}
