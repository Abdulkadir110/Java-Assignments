public class NumbersFromOneToFiftySkippingMultipleOfSix {
	public static void main (String[]args) {
		

		int counter = 1;		
		while(counter<= 50)	{
		
		if(counter % 6 != 0) {
				System.out.printf("The numbers are: %d\n", counter);
		}
			counter++;
		}
	
	}
}

	