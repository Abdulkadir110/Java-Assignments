public class FactorialOfFive {
	public static void main (String[]args) {
	
	int factorial = 1;
	int counter = 5;
				
	while (counter >=1) {
		factorial *= counter;
		System.out.printf("The factorial of 5 is: %d\n", factorial);
		
	counter--;
	}

	}
}


