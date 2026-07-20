public class AllTriangle {
	public static void main(String[]args)	{
		
		for (int lines = 1; lines <= 10; lines++)	{
			for(int asterisks = 1; asterisks <= lines; asterisks++)	{
				System.out.print("*");
			}
			for(int space = 10; space >= lines; space--)	{
				System.out.print(" ");
			}
			for(int asterisks = 10; asterisks >= lines; asterisks--)	{
				System.out.print("*");
			}
			for(int space = 1; space <= lines; space++)	{
				System.out.print(" ");
			}
			for(int space = 1; space <= lines; space++)	{
				System.out.print(" ");
			}
			for(int asterisks = 10; asterisks >= lines; asterisks--)	{
				System.out.print("*");
			}
			for(int space = 10; space >= lines; space--)	{
				System.out.print(" ");
			}
			for(int asterisks = 1; asterisks <= lines; asterisks++)	{
				System.out.print("*");
			}
				System.out.println();
		}
	
		
	}
}