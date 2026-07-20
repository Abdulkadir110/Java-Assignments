public class SumOfNumbersBetweenOneToFifty {
	public static void main (String[]args) {
	
	int sum = 0;
	int counter = 1;			
	while( counter <= 50 ) {
	sum += counter;
	System.out.printf("The  sum of numbers between 1 to 50 are: %d\n", sum);

	counter++;
	}

	}
}


