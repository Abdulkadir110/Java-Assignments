public class ApproximatePi {
	public static void main (String[]args) {
		
		double fractionsThreeToEleven = 1.0 - ((double)1/3) + ((double)1/5) - ((double)1/7) + ((double)1/9) - ((double)1/11);
		double fractionsThreeToThirteen = 1.0 - ((double)1/3) + ((double)1/5) - ((double)1/7) + ((double)1/9) - ((double)1/11) + ((double)1/13);
		

		double FirstPi = 4.0 * fractionsThreeToEleven;
		double SecondPi = 4.0 * fractionsThreeToThirteen;

		System.out.printf("The First Pi and Second Pi are: (%.2f, %.2f)", FirstPi, SecondPi );
	}
}
		