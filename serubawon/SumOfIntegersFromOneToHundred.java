public class SumOfIntegersFromOneToHundred {
	public static void main (String [] args) { 
		int sum = 0;
		 for (int counter = 1; counter <= 100; counter++)	{
			sum += counter;
			System.out.printf("The sum of %d is %d%n", counter, sum);
		}
	}
}