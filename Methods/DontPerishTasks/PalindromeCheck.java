
public class PalindromeCheck {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = input.nextLine();

		boolean palindromeResult = isPalindrome(word);
		
		System.out.println("The outcome is: " + palindromeResult);
	}
	public static boolean isPalindrome(String word )	{
		return (word.charAt(0) == word.charAt(word.length()-1) && word.charAt(1) == word.charAt(word.length() -2));
	}
}


