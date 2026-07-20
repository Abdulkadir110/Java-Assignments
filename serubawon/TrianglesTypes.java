import java.util.Scanner;
public class TrianglesTypes {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the first side: ");
	int sideOne = input.nextInt();
	
	System.out.print("Enter the second side: ");
	int sideTwo = input.nextInt();
	
	System.out.print("Enter the third side: ");
	int sideThree = input.nextInt();

	if( sideOne == sideTwo && sideOne == sideThree)	{
		System.out.print("This is an Equilateral Triangle");
	}	
	else if( sideOne == sideThree && sideTwo != sideThree )	{
		System.out.print("This is an Isosceles Triangle");
	}
	else if( sideTwo == sideThree && sideTwo != sideOne )	{
		System.out.print("This is an Isosceles Triangle");
	}
	else if( sideOne == sideTwo && sideTwo != sideThree )	{
		System.out.print("This is an Isosceles Triangle");
	}	
	else if( sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree )	{
		System.out.print("This is a Scalene Triangle");
	}
}
}