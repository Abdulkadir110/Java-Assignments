/** Start
* import Scanner;
* prompt the user to collect an integer number,
* if the score >=90, print A.
* else if the score >=80 and < 90 , print B
* else if the score >=70 and < 80 , print C
* else if the score >=60 and < 70 , print D
* else , print F
End */





import java.util.Scanner;
	public class LetterGrade{
		public static void main(String[]args)	{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number: ");
			int score = input.nextInt();
			
		if ( score >= 90) {
			System.out.print("The Grade is A");
		}
		else if (score >= 80 && score < 90) {
			System.out.print("The Grade is B");
		}
		else if (score >= 70 && score < 80) {
			System.out.print("The Grade is C");
		}
		else if (score >= 60 && score < 70) {
			System.out.print("The Grade is D");
		}
		else {
			System.out.print("The Grade is F");
		}
	}
}