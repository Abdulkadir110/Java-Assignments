public class StatisticsCalculator{
	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}


	private static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	private static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}
    

    public static double calculateMeanOf(int[] numbers) {
        int sum = 0; 
        double meanOfTheNumbers = 0;
       
        for (int index = 0; index < numbers.length; index++) {
                sum += numbers[index];
        }
            return sum / numbers.length;
    }
    /////////////////////////////////////////////////--Median--//////////////////////////////////////////
    public static int calculateMedianOf(int[] numbers) {
        int median = 0;
        int medianIndex = 0;
        int[] descendingArrayOfNumbers = descendingArray(numbers);
        int lengthOfDescendingArrayOfNumbers = descendingArrayOfNumbers.length;
        if(lengthOfDescendingArrayOfNumbers % 2 == 0) {
             int firstNumberInTheMiddleIndex = (lengthOfDescendingArrayOfNumbers / 2 ) - 1;
             int SecondNumberInTheMiddleIndex = (lengthOfDescendingArrayOfNumbers / 2 );

            medianIndex = (firstNumberInTheMiddleIndex + SecondNumberInTheMiddleIndex) / 2;
            return numbers[medianIndex];
        }
        else {
                medianIndex =  numbers.length / 2 ;               
                return numbers[medianIndex];
        }
    }
    
    private static int[] descendingArray(int[] numbers) {

        for (int index = 0; index < numbers.length; index++) {

                for(int newIndex = 0; newIndex < numbers.length; newIndex++) {

                    if(numbers[newIndex] < numbers[index]) {
                        int temp = numbers[newIndex];
                        numbers[newIndex] = numbers[index];
                        numbers[index] = temp;
                        
                    }
                        
                }

        }

      return numbers;
    }
    //////////////////////////////////////////--Mode--////////////////////////////////////////////////////
    
    public static int calculateModeOf(int[] numbers) {
        int modeCounter = 0;
        int mode = 0;
        int temp = 0;
        for(int index = 0; index < numbers.length; index++) {
            modeCounter = 0;
               for(int counterIndex = 0; counterIndex < numbers.length; counterIndex++) {
                    if(numbers[index] == numbers[counterIndex]) {
                        modeCounter++;
                        mode = numbers[index];
                        
                    }
                }
                    temp = modeCounter;
             if (modeCounter > temp) {
                   mode = numbers[index];
             }          
        }
        return mode;
          
    }

     
    ///////////////////////////////////////////---Deviation--///////////////////////////////////////////////
    
    public static double[] calculateDeviationOf(int [] numbers) {
        double sum = 0; 
        double differenceBetweenEachNumberAndMean = 0;
        double[] deviation = new double [numbers.length];
        for (int index = 0; index < numbers.length; index++) {
                 differenceBetweenEachNumberAndMean = numbers[index] - calculateMeanOf(numbers);
                 deviation[index] += differenceBetweenEachNumberAndMean;
        }
        return deviation;
    }   
    
     public static double calculateMeanDeviationOf(int [] numbers) {
        double deviation = 0;
        double sum = 0;
        double[] deviationCollection = calculateDeviationOf(numbers);
        for (int index = 0; index < numbers.length; index++) {
             sum += deviationCollection[index]; 
        }
            deviation = sum / numbers.length;
    
        return deviation;
    }
    
    public static double calculateVarianceOf(int [] numbers) {
        double variance = 0;
        double squareDeviation = 0;
        double sum = 0; 
        double differenceBetweenEachNumberAndMean = 0;

        for (int index = 0; index < numbers.length; index++) {
                 differenceBetweenEachNumberAndMean = numbers[index] - calculateMeanOf(numbers);
                 squareDeviation = Math.pow(differenceBetweenEachNumberAndMean, 2);
                 sum += squareDeviation;
        }
        variance = sum / numbers.length;
    
        return variance;
    } 

    public static double calculateStandardDeviationOf(int [] numbers) {
        double standardDeviation = calculateVarianceOf(numbers) / numbers.length;
        return standardDeviation;
    }
    public static double calculateCoefficientOfVarianceOf(int[] numbers) {
        double coefficientOfVariance = (calculateStandardDeviationOf(numbers) / calculateMeanOf(numbers)) * 100;
        return coefficientOfVariance;
    }   
}

