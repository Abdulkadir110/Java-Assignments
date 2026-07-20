/** Import Scanner;
*  prompt the user the label to collect their age
*  declare the age variable
*  if age < 13, print Child, 
*  if (age >=13 and age <=17), print Teenager
End */

import java.util.Scanner;
public class PeopleBracketOfAge {
	public static void main (String[]agrs) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your age: ");	
	int age = input.nextInt();
		
		if (age < 13) {
		System.out.print("Child");
		}
		else if (age >=13 && age <=17) {
		System.out.print("Teenager");
		}
		else if (age >=18 && age <=64) {
		System.out.print("Adult");
		}
		else {
		System.out.print("Senior");
		}
	}
}