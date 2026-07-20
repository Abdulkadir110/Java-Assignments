public class NumbersFromOneToHundred {
	public static void main (String[]args) {
				
		for( int counter = 1; counter <=100; counter++)	{
			if(counter % 4 != 0) {
				System.out.printf("The numbers are: %d\n", counter);
			}
			
		}
	}
}
