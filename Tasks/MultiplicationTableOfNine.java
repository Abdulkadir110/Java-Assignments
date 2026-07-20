//1) initialize variable product;
//2) State Condition that counts from 1 to 12;
//3) assign product * counter to the variable "product" in the loop
//4) print the counter result of the numbers product.


public class MultiplicationTableOfNine {
	public static void main (String[]args) {
		int product = 1;
		for( int counter = 1; counter <=12; counter++)	{
			product = 9 * counter;
		   System.out.printf(" %d x %d: %d\n", 9, counter, product);
			
		}
	}
}
