import java.util.Scanner;
	public class UserJourney {

		public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("The user destination is: ");
		
		String Destination = input.nextLine();

		System.out.print("The total distance is:  ");
		
		double totalDistance = input.nextDouble();
		
		System.out.print("The price of the Fuel is: ");
		double fuelPrice = input.nextDouble();
		
		System.out.print("The Fuel efficiency of the car is: ");
		double milage = input.nextDouble();

		
		double fuelNeededDestination = (totalDistance/milage);
		double totalPrice = (fuelNeededDestination * fuelPrice);
		
		double splitCost = (totalPrice/2);
		
			
		
	
		System.out.printf("The total Fuel needed to get your destination is: %.3f%n", fuelNeededDestination);
		System.out.printf("The total Cost is: %.3f%n", totalPrice);
		System.out.printf("The Split Cost is: %.3f%n", splitCost);
	}
}