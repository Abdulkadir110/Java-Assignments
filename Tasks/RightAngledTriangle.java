/** 
initialize base length variable to zero;	
Collect input of length of the base of a triangle from the user so the value can b stored in base length variable.
state a condtion that is apllicable to length less than 10;
state the condtion for each number and their equivalent asterisks triangle.
  
*/


import java.util.Scanner;
	public class RightAngledTriangle {
		public static void main(String [] args) {
		   Scanner input = new Scanner(System.in);
			int baseLength = 0;

			System.out.print("Enter the base length for the triangle: ");
			baseLength = input.nextInt();
			
			for (int count = 1; count <= baseLength; count++){
			   for (int asterisks = 1; asterisks <= count; asterisks++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	


















	/**		 if (baseLength <= 10)	{
				if(baseLength == 1) {
				   System.out.println("*");
				}
				if(baseLength == 2) {
				   System.out.println("*");
				   System.out.println("* *");
				}
				if(baseLength == 3) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				}
				if(baseLength == 4) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
				   
				}
				if(baseLength == 5) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				}
				if(baseLength == 6) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				   System.out.println("* * * * * *");
				}
				if(baseLength == 7) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				   System.out.println("* * * * * *");
				   System.out.println("* * * * * * *");
				}
				if(baseLength == 8) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				   System.out.println("* * * * * *");
				   System.out.println("* * * * * * *");
				   System.out.println("* * * * * * * *");
				}
				if(baseLength == 9) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				   System.out.println("* * * * * *");
				   System.out.println("* * * * * * *");
				   System.out.println("* * * * * * * *");
				   System.out.println("* * * * * * * * *");
				}
				if(baseLength == 10) {
				   System.out.println("*");
				   System.out.println("* *");
			           System.out.println("* * *");
				   System.out.println("* * * *");
			           System.out.println("* * * * *");
				   System.out.println("* * * * * *");
				   System.out.println("* * * * * * *");
				   System.out.println("* * * * * * * *");
				   System.out.println("* * * * * * * * *");
				   System.out.println("* * * * * * * * * *");
				}
				
			 }
		 else {
		System.out.println("The triangle with the base length is not available");
			}	
	}
}*/
