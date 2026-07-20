public class IntegersInForLoop {
	public static void main(String[]args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number: ");
		int n = input.nextInt();

			for(int i = 1; i < n; i++)	{
				for(int j < n; j > i; j++) {
					System.out.printf("(%d, %d)", i, j);
				}
		
			} 

	}
}