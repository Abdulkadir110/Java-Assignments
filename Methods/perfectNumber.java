public class perfectNumber {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        boolean perfectNumber = sumOfThePrimeFactorsOf(number);

        System.out.println("The outcome is " + perfectNumber);
    }

    public static boolean sumOfThePrimeFactorsOf(int number){
         int temp = 0;
        for (int primeCounter = 2; primeCounter <= number; primeCounter++) {
                for(int secondCounter = 1; secondCounter <= number; secondCounter++) {
                        if (number % secondCounter == 0) {

                              temp += secondCounter; 
                              number = number / primeCounter;                 
                        }
                        else {
                                break;
                            }
                }
        }
                    int sum = temp + 1;
                    return sum == number;

      }
    
  }


