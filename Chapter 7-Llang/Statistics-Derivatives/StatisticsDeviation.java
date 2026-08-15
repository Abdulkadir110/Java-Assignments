public class StatisticsDeviation{
    public static int mean(int[] numbers) {
        int sum = 0;
        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            
            
        }
        return sum / numbers.length ;
    }
    public static double mean(double[] numbers) {
        double sum = 0;
        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            

        }
        
     return Math.ceil((sum / numbers.length) * 100.0)  / 100.0;
    }
    
    public static double[] DeviationsOf(double [] numbers) {
        double sum = 0; 
        double differenceBetweenEachNumberAndMean = 0;
        double[] deviationArray = new double [numbers.length];
        for (int index = 0; index < numbers.length; index++) {
                 differenceBetweenEachNumberAndMean = numbers[index] - mean(numbers);
                 deviationArray[index] += Math.pow(differenceBetweenEachNumberAndMean, 2);
        }
        return deviationArray;
    }
    public static double deviation(double [] numbers) {
        double deviation = 0;
        double nomerator = 0;
        for (int index = 0; index < numbers.length; index++) {
            nomerator += DeviationsOf(numbers)[index];
        }
        return Math.ceil((nomerator / numbers.length - 1) * 100.0) / 100.0;
    }   
}
