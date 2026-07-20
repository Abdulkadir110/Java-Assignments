import java.util.Scanner
class CustomerService{
	
	static void main(String...args) {
	
		Scanner inputCollector = new Scanner(System.in);
	String mainmenu = """
Welcome to Orion Customer Service

PRess 1 for English
Press 2 for yoruba
Press 3 for igbo
press 4 for hausa


""";

System.ut.println(mainMenu);
int mainMenuChoice = inputCollector.nextInt();

switch(mainMenuChoice)	{
case1 -> System.out.println("English Menu");
case2 -> System.out.println("Yoruba Menu");
case3 -> System.out.println("Igbo Menu");
case4 -> System.out.println("Hausa Menu");
defualt -> System.out.println("Oga go school");

}

}

}