
public class DisplayFractions {
	public static void main(String[] args)	{
		
		double numerator = 1;
		double denomerator = 3;
		double result = 0;
		for(int counter = 1; counter <= 50; counter++)	{
		
		result = numerator +denomerator;	
			
			numerator += 2;
			denomerator += 2;

		
		}
		System.out.print("The value for the fraction is " + result);
	}
}