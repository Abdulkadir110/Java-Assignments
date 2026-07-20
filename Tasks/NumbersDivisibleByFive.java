//1) State Condition that counts from 1 to 100;
//3) State a condtion that supports if the counter is 5
//4) print the counter result of the numbers.


public class NumbersDivisibleByFive {
	public static void main (String[]args) {
			
		for( int counter = 1; counter <=100; counter++)	{
			if(counter % 5 == 0) {
				System.out.printf("The numbers divisible by 5 are: %d\n", counter);
			}
		}
	}
}
