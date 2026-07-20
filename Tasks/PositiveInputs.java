import java.util.Scanner;
public class PositiveInputs {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a postive number: ");
	int number = input.nextInt();

	
	int counter = 1;		
	do {
	
	System.out.print("Enter a positive number: ");
	number = input.nextInt();
	
	counter++;
	}
	while(number > 0 );

	}
}


