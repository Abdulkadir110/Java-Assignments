/**  
Collect input for the subtotal and gratuity rate from the user;
calculate the gratuity by multiplying the gratuity rate by the given subtotal.
calculate the total by adding the gratuity and the subtotal;

*/

    
import java.util.Scanner;
public class FinancialApplication {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double subTotal = 0;
		double gratuityRate = 0;
			
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subTotal = input.nextDouble();
		gratuityRate = input.nextDouble() / 100;	
			
		double gratuity = gratuityRate * subTotal;
		double total = gratuity + subTotal;
		System.out.printf("The gratuity is $%.1f and total is $%.1f.", gratuity, total);
	}
}