import java.util.Scanner; 
public class AgeCalculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		System.out.printf("Your age next year will be: %d", (age + 1));
	}
}
