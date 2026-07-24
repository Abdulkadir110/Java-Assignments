/*
collect input from the user
set a loop that counts from the first prime number till it reaches the number inputed by the user
set an inner loops that runs from 1 to the number then if each of the outerloop counter can divide the number without any remainder
it should store it in a variable then add it.
**/



public class SumOfPrimeNumbers {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        sumOfThePrimeFactorsOf(number);
    }

    public static void sumOfThePrimeFactorsOf(int number){
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
                    System.out.println((temp + 1));

      }


    
       
 }

			
