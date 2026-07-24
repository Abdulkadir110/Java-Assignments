
public class CubingANumber {
	public static void main(String [] args) {
		
		int cube = cubeOf(5);
		System.out.println("The cube of 5 is: " + cube);
				
	}
	
	public static int cubeOf(int n)	{
		int cubeOfN = n * n * n;
		
		return cubeOfN;
	}

