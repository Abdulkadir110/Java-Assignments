import java.util.Scanner;
public class SumOfNumbersOfUsers {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);	

	int sum = 0;
	int counter = 1; 
	while ( counter <= 5) {
	
		System.out.print("Enter your numbers: ");
		int number = input.nextInt();
	
		sum +=number;
		counter++;

	}
		System.out.printf("The sum of the numbers is: %d", sum);


	

	}
}
