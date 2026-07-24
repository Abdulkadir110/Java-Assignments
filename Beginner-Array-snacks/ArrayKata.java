public class ArrayKata {

   public static int maximumIn(int[] numbers) {
        int largest = 0;

        largest = numbers[0];

        for (int index = 0; index <= numbers.length - 1; index++){

            if(largest < numbers[index] ){
                largest = numbers[index];

            }

        }
        return largest;
        
    }

    public static int minimumIn(int[] numbers) {
        int smallest = 0;

        smallest = numbers[0];

        for (int index = 0; index <= numbers.length - 1; index++){

            if(smallest > numbers[index] ){
                smallest = numbers[index];

            }

        }
        return smallest;
        
    }       

    public static int sumOf(int[] numbers) {
        int sum = 0;

        for (int index = 0; index <= numbers.length - 1; index++)sum += numbers[index];

        return sum;
        
    }    
     
    public static int sumOfEvenNumbersIn(int[] numbers) {
        int sumOfEvenNumbers = 0;
        
        for (int index = 0; index <= numbers.length - 1; index++){
              if (numbers[index] % 2 == 0)sumOfEvenNumbers += numbers[index];

        }
        return sumOfEvenNumbers;
        
    }    

    public static int sumOfOddNumbersIn(int[] numbers) {
        int sumOfOddNumbers = 0;
        
        for (int index = 0; index <= numbers.length - 1; index++){
              if (numbers[index] % 2 == 1)sumOfOddNumbers += numbers[index];

        }
        return sumOfOddNumbers;
        
    } 
    
    public static int[] minimumAndMaximumOf(int[] numbers) {
        int largest = 0;
        int smallest = numbers[0];
        int[] minAndMax = new int[2];
        

        for (int index = 0; index <= numbers.length - 1; index++){

            if(smallest > numbers[index] ){
                smallest = numbers[index];

                minAndMax[0] = smallest;

            }

            if(largest < numbers[index] ){
                largest = numbers[index];
                
                minAndMax[1] = largest;
            }
                
            
            

        }
           return minAndMax;
          
    }

    public static int noOfOddNumbersIn(int[] numbers) {
        int numberOfOddNumbers = 0;
        
        for (int index = 0; index <= numbers.length - 1; index++){
              if (numbers[index] % 2 == 1)numberOfOddNumbers++;

        }
        return numberOfOddNumbers;
    }
    
    public static int noOfEvenNumbersIn(int [] numbers) {
        int numberOfEvenNumbers = 0;
        
        for (int index = 0; index <= numbers.length - 1; index++){
              if (numbers[index] % 2 == 0)numberOfEvenNumbers++;

        }
        return numberOfEvenNumbers;
    }
   
    public static int[] evenNumbersIn(int [] numbers) {
        int numberOfEvenNumbers = 0;
        
        for (int index = 0; index < numbers.length; index++){
              if (numbers[index] % 2 == 0) {
                 numberOfEvenNumbers++;  
              }
            
        }
        
        int[] evenNumbers = new int [numberOfEvenNumbers];

        int evenIndex = 0;

          for(int index = 0; index < evenNumbers.length; index++){
               if (numbers[index] % 2 == 0) {
                    evenNumbers[evenIndex] = numbers[index]; 
                    evenIndex++; 
              }
            }
          for (int index = 0; index < evenNumbers.length; index++){
                return evenNumbers;
            }
            return evenNumbers;
        
    }
    

}
