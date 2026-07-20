public class AreaAndPerimeterOfCircle {
	public static void main(String[]args){			
			

		double radius = 5.5;
		
		double Pi = Math.PI;

		double area = radius * radius * Pi;
		
		double perimeter = 2 * radius * Pi;


		System.out.printf("The Perimeter of The circle is: %f\n And the Area is: %f", perimeter, area);
	}
}