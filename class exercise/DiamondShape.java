public class DiamondShape {
	public static void main(String []args)	{
		for(int line = 1; line <= 5; line++)	{
			for(int space = 5; space >= line; space--)	{
				System.out.print(" ");
			}
			for(int asterisks = 1; asterisks <= line; asterisks++)	{
				System.out.print("*");
				//System.out.print(" ");
			}
			for(int asterisks = line; asterisks >= 2; asterisks--)	{
				System.out.print("*");
				//System.out.print(" ");
			}
			for(int space = 1; space <= line; space++)	{
				System.out.print(" ");
			}
			
				System.out.println();
			
		}
		for(int line = 1; line <= 5; line++)	{
			for(int space = 1; space <= line; space++)	{
				System.out.print(" ");
			}
			for(int asterisks = 5; asterisks >= line; asterisks--)	{
				System.out.print("*");
				//System.out.print(" ");
			}
			for(int space = 1; space <= line; space++)	{
				System.out.print(" ");
			}
			
				System.out.println();
			
		}
	}
}



