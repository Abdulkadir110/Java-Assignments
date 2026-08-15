public class ThirdTriangle	{
	public static void main(String[]args)	{
		
	for (int lines = 1; lines <= 10; lines++)	{
			
			for(int space = 0; space <= lines; space++) {
				System.out.print(' ');
			}
				for(int asterisks = 10; asterisks >= lines; asterisks--){	 				System.out.print("*");
				}
				System.out.println();



		}

}
}