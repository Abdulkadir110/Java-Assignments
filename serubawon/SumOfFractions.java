import java.util.Scanner;
public class SumOfFractions {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your value for n: ");
		int number = input.nextInt();
		
		for(int count = 1; count <= number; count++) {
			for (int fraction = 1; fraction <= count; fraction++){
					int denominator = (1/count);
					System.out.print(denominator);
				}
		}
	}
}
			

			
