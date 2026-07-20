	public class TheExpressionProgram{
		public static void main(String[]args) {
		
		 
			double firstPartOfNumerator = 15.8 * 6.2;
			double secondPartOfNumerator = 4.1 * 2.5;
			
			double numerator = firstPartOfNumerator - secondPartOfNumerator;
			
			double firstPartOfDenomerator = 12.4;
			double secondPartOfDenomerator = 1.8;


			double denomerator = firstPartOfDenomerator - secondPartOfDenomerator;
			
			double result = numerator/denomerator;

			System.out.printf("The Result for this program: %f", result );
		}
}