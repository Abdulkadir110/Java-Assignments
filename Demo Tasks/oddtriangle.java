public class oddtriangle {
	public static void main (String[]args) {
		java.util.Scanner input = new java.util.Scanner(System.in); 
		
		int rowSumOddNumbers = -1;
		System.out.print("Enter the number of rows: ");
		int row = input.nextInt();
		for(int counter = 1; counter <= row; counter++){
			for(int space = row; space >= counter; space--){
				System.out.print(" ");
			 }
			for(int number= 1; number <= counter; number++)	{
				rowSumOddNumbers += 2;
				//System.out.print(" ");
				System.out.print(rowSumOddNumbers);
				System.out.print(" ");
	
			}
			System.out.println();
		} 
	
