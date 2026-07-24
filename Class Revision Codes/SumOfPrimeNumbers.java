/*
collect input from the user
set a loop that counts from the first prime number till it reaches the number inputed by the user
set an inner loops that runs from 1 to the number then if each of the outerloop counter can divide the number without any remainder
it should store it in a variable then add it.


number - divide - factor
**/



public class SumOfPrimeNumbers {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        sumOfThePrimeFactorsOf(number);
    }

    public static void sumOfThePrimeFactorsOf(int number){
         int factors = 2;
         int sum = 0;
        while(number > 1) {
            if (number % factors == 0) {
                System.out.println(factors);
                sum += factors;
                number /= factors;
                
            }
            else {
                factors++;
            }

        }

        System.out.println("The sum of the numbers is: " + sum);

      }


    
       
 }

			
