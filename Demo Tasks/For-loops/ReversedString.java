public class ReversedString {
	public static void main(String[]args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a word: ");
		String givenWord = input.nextLine();

		for ( int counter = givenWord.length() - 1; counter >= 0 ; counter--){
			System.out.print(givenWord.charAt(counter));
		}
	}
}