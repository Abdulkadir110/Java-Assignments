import java.util.Scanner;
	public class VowelReader {
		public static void main (String[]args)	{
			Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String vowel = input.nextLine();

	String vowel1 = "a";
	String vowel2 = "e";
	String vowel3 = "i";
	String vowel4 = "o";
	String vowel5 = "u";	
		
if(vowel.equalsIgnoreCase(vowel1) || vowel.equalsIgnoreCase(vowel2)  ||vowel.equalsIgnoreCase(vowel3) || vowel.equalsIgnoreCase(vowel4) ||vowel.equalsIgnoreCase(vowel5) ) {
	System.out.print("The letter is vowel");
}
else {
	System.out.print("Consonant");
}


}
}