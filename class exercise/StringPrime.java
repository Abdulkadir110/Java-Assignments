
public class StringPrime {
	public static void main(String[]args)	{
		
		
	   for ( int counter = 1; counter <= 1000; counter++)  {
		
		for (int secondcounter = counter; secondcounter <1000; secondcounter++){

		if( counter % secondcounter != 0 )	{

			System.out.printf("%d %d", counter, secondcounter);
		}
		}
	   }
		
	}
}
			