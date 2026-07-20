import java.util.Scanner; 
public class grade {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the score: ");
		
		int score = input.nextInt();

		System.out.println(score >= 50 ? "Passed" :"Failed");

		//	if(score >= 50) {
		//	System.out.print("Passed");
		//}
		//else {
		//	System.out.print("failed");
		//}		
	}	
}