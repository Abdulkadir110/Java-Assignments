import java.util.Arrays;
public class CombiningTwoArrays {
        public static void main (String [] args) {
           int[] firstNumbers = {1,2,3};
           int[] secondNumbers = {4,5,6};
            
            System.out.println(Arrays.toString(combineTwoArrysOf(firstNumbers,secondNumbers)));
           
        }

        public static int[] combineTwoArrysOf(int[] firstNumbers, int[] secondNumbers) {
             
            int combinedArrayLength = firstNumbers.length + secondNumbers.length;
            int count = firstNumbers.length;    
         
            int[] combinedArrays = new int[combinedArrayLength];
            
            for(int index = 0; index <= firstNumbers.length - 1; index++){
                    combinedArrays[index] = firstNumbers[index];
            }
            for(int index = 0; index <= secondNumbers.length - 1; index++){
                    combinedArrays[count++] = secondNumbers[index];
            }
            
             return combinedArrays;
            
        }
        
}
