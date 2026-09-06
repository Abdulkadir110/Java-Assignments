public class AddTwoIndexesTogether {
    public int[] addNumbersIn(int[] numbers){
        int length = numbers.length;
        int[] newArray;
        if(length % 2 == 0) {
            newArray = new int[length/2];
        }
        else {
            newArray = new int[(length / 2) + 1];  
        }
        
        int firstIndex = 0;
        int secondIndex = 1;
        int count = 0;
        int sum = 0;
        
        while(count < newArray.length){
            sum = numbers[firstIndex] + numbers[secondIndex];
            newArray[count] = sum;
            firstIndex  += 2;
            secondIndex += 2;
            count++;
            if(count == newArray.length - 1 && length % 2 != 0){
                newArray[newArray.length - 1] = numbers[length-1];
                break;
            }
        }
        return newArray;
    }
    public int[] addNumbersV2(int[] numbers) {
        int length = numbers.length;
        int[] newArray = new int [length -1];
       
        int firstIndex = 0;
        int secondIndex = 1;
        int count = 0;
        int sum = 0;
        
        while(count < newArray.length){
            sum = numbers[firstIndex] + numbers[secondIndex];
            newArray[count] = sum;
            firstIndex++;
            secondIndex++;
            count++;
            
        }
        return newArray;
   
    }
}
