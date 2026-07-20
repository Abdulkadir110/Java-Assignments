public class MultiplicationTableOfFive {
	public static void main (String[]args) {
	
	int counter = 1;
	int product = 1;		
	do {
	product = 5 * counter;
		System.out.printf(" 5 x %d: %d\n", counter, product);
	
	counter++;
	}
	while( counter <= 12 );

	}
}


