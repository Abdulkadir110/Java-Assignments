/*

collect two input from the user, the first to collect the student major and the second to collect a digit representing the student year.
Create a selection statement that says what to print out whenever the user input each of the valid characters 
print the user full major name and year status

**/

public class StudentStatus {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		 System.out.print("Enter a character(I,C,A) for student major: ");
		 String studentMajor = input.next();
		
		 System.out.print("Enter a number(between 1 to 4) for student year status: ");
		 int studentYearStatus = input.nextInt();

		 switch(studentMajor) {
			case "I" : System.out.println("The student major name is Information Management");break;
			case "C" : System.out.println("The student major name is Computer Science");break;
			case "A" : System.out.println("The student major name is Accounting");break;
			default : System.out.println("Invalid Character");
		 }
		 switch(studentYearStatus) {
			case 1 : System.out.println("The student year status is Freshman");break;
			case 2 : System.out.println("The student year status is Sophomore");break;
			case 3 : System.out.println("The student year status is Junior");break;
			case 4 : System.out.println("The student year status is Senior");break;
			default : System.out.println("Invalid Character");
		 }
			
		
	}
}
		 
