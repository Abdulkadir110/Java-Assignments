public class WhileLoop {
	public static void main(String[]args){
		int counter = 1;
		do {
			System.out.printf("%d ", counter);
			counter++;

		} while (counter<=10);


	}
}



//for(int counter = 10; counter >= 1 ; counter--) {
		//	System.out.printf("%d ", counter);











































/**	Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer for addition: ");
		int data =input.nextInt();
		int sum = 0;
		do {
		sum += data;
		System.out.printf("The sum of the number is: %d\n", sum);

		System.out.print("Enter the integer for addition, Enter 0 to terminate: ");
		data = input.nextInt();
		
		
		
		}
			while (data != 0);
			sum += data;

	}
}*/



/**		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer for addition,Enter 0 to terminate: ");
		int data = input.nextInt();
		
		int sum = 0;
		
		

		while(data != 0) {
		sum += data;

		System.out.print("Enter the integer for addition, Enter 0 to terminate: ");
		data = input.nextInt();
		
		
		}
		
		System.out.printf("The Sum is: %d", sum);
	
	}
}*/	
	
	

































	/**	int number = (int)(Math.random() * 101);
		System.out.print("Guess the number between 0 to 100: ");
		int guessNumber = input.nextInt();	

		
		while ( guessNumber != number) {
		//      System.out.print("\nEnter your guess: ");
  		//	 guessNumber = input.nextInt();
		
			if (guessNumber == number) {
          		System.out.println("You guessed the right number,yayyy");
			}
			else if(guessNumber > number) {
			System.out.println("The guessed Number is too high");
			}
			else if(guessNumber < number) {
			System.out.println("The guessed Number is too low");
			}

			System.out.println("Try again, the number is: ");
			guessNumber = input.nextInt();

			if (guessNumber == number) {
          		System.out.println("You guessed the right number,yayyy");
			}
		}
	}
}*/
































/**		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		

		System.out.printf("What is the sum of %d + %d is: ", number1, number2);
		int sum = input.nextInt(); 

		while(number1 +  number2 != sum) {
			System.out.printf("Try again; The sum of %d + %d is: ", number1, number2);
			sum = input.nextInt();
		}
		System.out.println ("You got it, yayyyy");

		while(number1 + number2 == sum) {
			number1 = (int)(Math.random() * 10);
			number2 = (int)(Math.random() * 10);
		
		System.out.printf("What is the sum of %d + %d is: ", number1, number2);
		sum = input.nextInt(); 
		
		System.out.println ("You got it, yayyyy");
		}
		
	}
} */







/**	System.out.print("Enter the gallons used: ");
		double gallonsUsed = input.nextInt();
		
		System.out.print("Enter the miles Driven: ");
		double mileDriven = input.nextInt();
	
		double milePerGallon = mileDriven / gallonsUsed;
		
		
	while(milePerGallon > 1) {
		
	System.out.printf("The miles per gallon is: %f", milePerGallon);
		milePerGallon++;
		

		}
		
		System.out.printf("The miles per gallon is: %f", milePerGallon);
		
	}
}*/











/**		Scanner input = new Scanner(System.in);

		int studentCounter = 1;
		int passes = 0;
		int failures = 0;
		
		while (studentCounter <=10) {
			System.out.print("(Enter result (1 = pass, 2 = fail):");
			int nextExamResult = input.nextInt();
			
			if(nextExamResult == 1) {
				passes++;
			}
			else {
				failures++;
			}
			studentCounter++;
		}
		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
	}
}*/

/** Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number, Enter 1 to quit: ");
		int number = input.nextInt();
			
		int total = 0;
		while(number != 1) {

		total = total + number;
		System.out.print("Enter the number, Enter 1 to quit: ");
		number = input.nextInt();
		
		total++;
		
	       }*/












