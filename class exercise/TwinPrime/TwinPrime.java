import java.util.Arrays;
public class TwinPrime {
       public static boolean isPrimeIn(int number) {
            int primeCounter = 0;
            int prime = 0;
            boolean isPrime = false;
            for(int index = 1; index <= number; index++) {
                if(number % index == 0) {
                      primeCounter++;
                }
             }           
             if(primeCounter == 2){
                    isPrime = true;
                }            

        return isPrime;
       }
     public static int[][] arrayOfTwinPrime(int number) {
        int[][] twinPrimes = new int[number][2];
        int count = 0;
        int num = 2;
        
        while(count < number){
            if(isPrimeIn(num) && isPrimeIn(num + 2)){
                twinPrimes[count][0] = num;
                twinPrimes[count][1] = num + 2;
                count++;
            }
            num++;
        }
        return twinPrimes;       
    }
//
//    public static void main (String[] args) {
//        int[][] arrays = arrayOfTwinPrime(5);
//        System.out.println(Arrays.deepToString(arrays));
//    }
}

