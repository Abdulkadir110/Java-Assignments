public class NumbersDivisibleByNine {
	public static void main(String [] args)	{
		int counter = 1;
	
	do {
		if(counter % 9 == 0 ) {
		  System.out.printf("The numbers divisble by 9 are: %d\n", counter);
		}
	counter++;
	}
	
	while(counter <= 200);
	}
}