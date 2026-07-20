/*
collect the input of a lowercase or uppercase letter from the user.
Display the corresponding keypads

**/

public class TelephoneKeypads {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the lettercase: ");
		String letterCase = input.nextLine().toLowerCase();
		
	
		switch(letterCase)	{
			case "a","b","c"->{ 
			System.out.println("The keypad number is 2");
			break;
			}
			case "d","e","f"-> { 
			System.out.println("The keypad number is 3");
			break;
			}
			case "g","h","i"-> {
			System.out.println("The keypad number is 4");
			break;
			}
			case "j","k","l"-> {
			System.out.println("The keypad number is 5");
			break;
			}
			case "m","n","o" -> {
			System.out.println("The keypad number is 6");
			break;
			}
			case "p","q","r","s"-> {
			System.out.println("The keypad number is 7");
			break;
			}
			case "t","u","v"-> {
			System.out.println("The keypad number is 8");
			break;
			}
			case "w","x","y","z"-> {
			System.out.println("The keypad number is 9");
			break;
			}
			default ->System.out.println("Invalid input for non-letters");
			
		}
	}
}