//1) initialize variable product;
//2) State Condition that counts from 1 to 10;
//3) assign product * counter to the variable "product" in the loop
//4) print the counter result of the numbers product.


public class ProductOfNumbersBetweenOneToTen {
	public static void main (String[]args) {
		int product = 1;
		for( int counter = 1; counter <=10; counter++)	{
			product *= counter;
		   System.out.printf("The products of numbers from 1 to 100 is: %d\n", product);
			
		}
	}
}
