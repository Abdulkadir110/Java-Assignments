public class UpperCaseLetters {
	public static void main(String[]args)	{
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter your word: ");
		String word = input.nextLine();
		
		int uppercaseCounter = 0;
		for(int counter = word.length(); counter >= 0; counter--) {
			System.out.print(word.toUpperCase());
		} 
	}
}