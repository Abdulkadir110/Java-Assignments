import java.util.Scanner;

	public class Shapes{
		public static void main(String[]args){
			System.out.println{"**" + "   " + "**" + "   " + "   " + "**"};
			System.out.println{"**" + "   " + "**" + "   " + "   " + "**"};
			System.out.println{"**" + "   " + "**" + "   " + "   " + "**"};
			System.out.println{"**" + "   " + "**" + "   " + "   " + "**"};
			System.out.println{"**" + "   " + "**" + "   " + "   " + "**"};


			Scanner scanner = new Scanner(System.in);
			int score = scanner.nextInt();

			switch(score){
				case 90:
					System.out.print("The first condition was met");
				case 80: 
               				System.out.println("The second condition was met");
            			case 70: 
                			System.out.println("The third condition was met");
            			case 60: 
                			System.out.println("The fourth condition was met");
        		}

       			 int counter = 1;   
       			
			// System.out.println(counter);
        		System.out.printf(counter);
			
		}
}