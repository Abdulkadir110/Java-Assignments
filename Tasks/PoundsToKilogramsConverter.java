/**  
Collect input for the weight in pounds from the user;
then convert the weight in pounds to kilogram by multiplying the pounds by 0.454 kilogram
then print out the values of pounds and its equivalent in Kilogram

*/

    
import java.util.Scanner;
public class PoundsToKilogramsConverter {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double weightInPounds = 0;
			
		System.out.print("Enter a number in pounds: ");
		weightInPounds = input.nextDouble();	
			
		double weightInKilograms = weightInPounds * 0.454;
		
		System.out.printf("%.1f pounds is %.3f kilograms ", weightInPounds, weightInKilograms);
	}
}