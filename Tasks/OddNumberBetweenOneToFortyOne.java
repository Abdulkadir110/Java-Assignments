public class OddNumberBetweenOneToFortyOne {
	public static void main (String[]args) {
	
	int counter = 1;
			
	do {
	if(counter % 2 == 1) {
		System.out.printf("The odd numbers between 2 to 40 are: %d\n", counter);
	}
	counter++;
	}
	while( counter <= 41 );

	}
}


