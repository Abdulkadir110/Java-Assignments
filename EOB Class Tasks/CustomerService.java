import java.util.Scanner; 
public class CustomerService{   

	 public static void main(String... args){

		Scanner inputCollector = new Scanner(System.in);

		String mainMenu = """
Welcome to Orion Customer Service

Press 1 for English
Press 2 for Yoruba
Press 3 for Igbo
Press 4 for Hausa

""";

		System.out.println(mainMenu);
		int mainMenuChoice = inputCollector.nextInt();


		switch(mainMenuChoice){
		case 1 : System.out.println("English Menu"); 
			String englishMenu = """
Press 1 to Borrow
Press 2 to Buy Airtime
Press 3 to Buy Data
""";
			System.out.println(englishMenu);
			int englishMenuChoice = inputCollector.nextInt();

			switch(englishMenuChoice){
				case 1:  System.out.println("You want to borrow abi"); break;
				case 2:  System.out.println("You wan Buy card abi"); break;
				case 3:  System.out.println("Your data don finish again?"); break;
				default:  System.out.println("Oga you suppose dey go school"); 
			}
			break;
		case 2 : System.out.println("Yoruba Menu"); break;
		case 3 : System.out.println("Igbo Menu"); break;
		case 4 : System.out.println("Hausa Menu"); break;
		default: System.out.print("Oga go school");

		}


		}
}