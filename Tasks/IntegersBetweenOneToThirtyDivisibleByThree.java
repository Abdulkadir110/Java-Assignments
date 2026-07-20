/**PseudoCode;
initialize sum variable to zero;
state a condition loop thats counts from number 1 to 30;
state a condition that only consider numbers that has zero remainders when divided by three
then for very number that follows the condtion, it is added to sum variable.
*/






public class IntegersBetweenOneToThirtyDivisibleByThree {
	public static void main (String [] args) {
		int sum = 0;
		
		for (int number = 1; number <= 30; number++) {
			if(number % 3 == 0) {
				sum += number;
			}
		}


		System.out.printf("The sum of numbers between 1 to 30 that are divisible by 3 is: %d", sum);

	}
}