public class MethodDemo {
	public static void main(String [] args)	{

		int sumResult = add(10, 5);
		int subtractResult = substract(23, 9);
		int divisionResult = divide(27, 3);
		int productResult = multiply(13, 6);

		System.out.println(sumResult);
		System.out.println(subtractResult);
		System.out.println(divisionResult);
		System.out.println(productResult);
	}
	
	public static int add(int a, int b)	{
		int sum = a + b;
		return sum;
	}


	public static int substract(int a, int b)	{
		int sub = a - b;
		return sub;
	}

	public static int divide(int a, int b)		{
		int division = a / b;
		return division;
	}
	public static int multiply(int a, int b)	{
		int product = a * b;
		return product;
	}
	
}

