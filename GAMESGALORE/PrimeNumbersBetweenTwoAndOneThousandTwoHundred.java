public class PrimeNumbersBetweenTwoAndOneThousandTwoHundred {
	public static void main(String[]args)	{
		for(int counter = 2; counter <= 1200; counter++)	{
			if ( counter % counter == 0 || counter / 1 == 0) {
				System.out.printf("%d\t\t\s\t", counter);
			}	
		}
	}
}	