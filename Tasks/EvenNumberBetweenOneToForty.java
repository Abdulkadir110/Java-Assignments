public class EvenNumberBetweenOneToForty {
	public static void main (String[]args) {
	
	int counter = 2;
			
	do {
	if(counter % 2 ==0) {
		System.out.printf("The even numbers between 2 to 40 are: %d\n", counter);
	}
	counter++;
	}
	while( counter <= 40 );

	}
}


