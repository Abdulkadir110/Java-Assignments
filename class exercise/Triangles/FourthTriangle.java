public  class FourthTriangle {
	public static void main(String[] args)	{
		
		for(int line = 10; line >=1; line--) {
			for(int space = 1; space <= line; space++)	{
				System.out.print(' ');
			}
			
				for(int asterisks = 10; asterisks >= line; asterisks--)	{
					System.out.print("*");
				}
		
					System.out.println();
		}
	}
}










