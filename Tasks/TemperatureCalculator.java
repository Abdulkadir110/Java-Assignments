//Question 3
import java.util.Scanner; 
public class TemperatureCalculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The temperature in kelvin: ");
		double kelvin = input.nextDouble();
		
		double celsius = kelvin - 273.15;
		double fahrenheit = celsius * (9/5) + 32;

		System.out.printf("The temperature value in Kelvin: %f%n The temperature value in Celsius: %f%n The temperature value in Fahrenheit: %f", kelvin , celsius, fahrenheit);
	}
} 
