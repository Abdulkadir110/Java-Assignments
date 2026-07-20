import java.util.Scanner;
public class Grades {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("Enter your grade: ");
	int grade = input.nextInt();

	
	int counter = 1;		
	do {
	
	System.out.print("Enter your grade: ");
	grade = input.nextInt();

	
	counter++;
	}

	while(grade != -1);

	}
}


