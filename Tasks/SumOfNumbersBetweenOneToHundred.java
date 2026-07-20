//1) initialize variable sum;
//2) State Condition that counts from 1 to 100;
//3) assign sum + counter to the veriable sum in the loop
//4) print the counter result of the numbers sum.


public class SumOfNumbersBetweenOneToHundred {
	public static void main (String[]args) {
		int sum = 0;
		for( int counter = 1; counter <=100; counter++)	{
			sum += counter;
		   System.out.printf("The sum of numbers from 1 to 100 is: %d\n", sum);
			
		}
	}
}
