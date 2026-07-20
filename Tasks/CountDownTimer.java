public class CountDownTimer {
	public static void main (String[]args) {
	
	int counter = 20;
			
	do {
	System.out.printf("The countdown timer from 20 to 0: %d\n", counter);
	
	counter--;
	}
	while( counter >= 0 );

	}
}


