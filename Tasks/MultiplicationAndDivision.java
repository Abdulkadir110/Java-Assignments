//Write a program that display the result of (9.5 x 4.5 - 2.5 x 3) / 45.5 - 3.5

	public class MultiplicationAndDivision{
		public static void main(String[]args) {
		
		 
			double firstPartOfNumerator = 9.5 * 4.5;
			double secondPartOfNumerator = 2.5 * 3;
			
			double numerator = firstPartOfNumerator - secondPartOfNumerator;
			
			double firstPartOfDenomerator = 45.5;
			double secondPartOfDenomerator = 3.5;


			double denomerator = firstPartOfDenomerator - secondPartOfDenomerator;
			
			double result = numerator/denomerator;

			System.out.printf("The Result for this program: %f", result );
		}
}