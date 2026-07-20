import java.util.Scanner;
public class UserNumbers {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	
	int sum = 0;
	int counter = 1;	

	
	do {
	
	System.out.print("Enter your number: ");
	int number = input.nextInt();

	sum += number;

	
	counter++;
	
	System.out.printf("The sum of the numbers is: %d%n", sum);
	}

	while(counter <= 5);

	}
}


