public class PrimeNumbersBetweenTwoAndFifty {
	public static void main(String[] args) {

		int prime = 0;
		for (int number = 2; number <= 50; number++) {		
			for (prime = 2; prime * prime <= number; prime++) {
  				
			}
			System.out.print(prime);
		}

	}
}
