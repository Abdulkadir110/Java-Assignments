//Question 9;
import java.util.Scanner;
  public class Greetings {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first Name: ");
		String firstName = input.nextLine();
	
		
		System.out.print("Enter your last Name: ");
		String lastName = input.nextLine();

		System.out.printf("Hello, %s %s", firstName, lastName);

	}
}