public class AddingTen {
	public static void main(String[] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		int addTen = addTenTo(n);

		System.out.println("The result is: " + addTen);
	}
	
	public static int addTenTo(int n)	{
		int add = 10 + n;

		return add;
	}
}