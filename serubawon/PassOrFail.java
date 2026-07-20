import java.util.Scanner;

public class PassOrFail {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);

		for (int score = 1; score <= 10; score++)	{
			System.out.print("Enter the exam scores: ");
			int scoreInput = input.nextInt();
			
			if(scoreInput >= 50)	{
				System.out.print("Pass\n");
			}
			else {
				System.out.print("Fail\n");
			}
		}

	}
}