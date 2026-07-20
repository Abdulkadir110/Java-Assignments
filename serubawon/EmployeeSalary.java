
import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Salary: ");
		int salary = input.nextInt();

	for (int count = 1; count<= 5; count++) {
		if( salary <= 50000) {
	
			System.out.print("Tax is 0%");
		}
		else if (salary <= 150000) {
			System.out.print("Tax is 10%");
		} 
		else if (salary > 150000) {
			System.out.print("Tax is 20%");
		}
		
	}
}
	