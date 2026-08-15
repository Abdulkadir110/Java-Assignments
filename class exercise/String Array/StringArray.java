public class StringArray {
    public static int lengthOfTheArray(String[] list){
        int length = 0;
        for (String fruits : list){
            length++;
        }
        return length;
    }
    public static int lengthOfTheArrayOf(double[] list){
        int length = 0;
        for (double number : list){
            length++;
        }
        return length;
    }
    public static String[] reverseTheArrayOf(String[] list) {
        String[] newArray = new String[lengthOfTheArray(list)];
        int secondIndex = lengthOfTheArray(list) - 1;
        for(int index = 0; index < lengthOfTheArray(list); index++){
            newArray[index] = list[secondIndex];
            secondIndex--; 
        }
        return newArray;
    }
    public static double[] reverseTheNumbersArray(double[] list) {
        double[] newArray = new double[lengthOfTheArrayOf(list)];
        int secondIndex = lengthOfTheArrayOf(list) - 1;
        for(int index = 0; index < lengthOfTheArrayOf(list); index++){
            newArray[index] = list[secondIndex];
            secondIndex--; 
        }
        return newArray;
    }
    public static double[] valueAtEachIndexOf(double[] numbers, int firstIndex, int secondIndex) {
        int length = (secondIndex -  firstIndex) + 1; 
        double[] values = new double[length];
        int newArrayIndex = 0;
        for(int index = firstIndex; index <= secondIndex; index++){
             values[newArrayIndex] = numbers[index];           
             newArrayIndex++;
        }
        return values;
    }
//    public static char[] valueAtEachIndexOf(String word, int firstIndex, int secondIndex) {
//        int length = (secondIndex -  firstIndex) + 1; 
//        char[] values = new char[length];
//        char[] string = word.toCharArray();
//        
//        int newArrayIndex = 0;
//        for(int index = firstIndex; index <= secondIndex; index++){
//             values[newArrayIndex] = string[index];           
//             newArrayIndex++;
//        }
//        return values;
//    }
//  
  public static String valueAtEachIndexOf(String word, int firstIndex, int secondIndex) {
        char[] eachCharacter = word.toCharArray();
        String getCharacters = "";
        
        for(int index = firstIndex; index <= secondIndex; index++){
            getCharacters += eachCharacter[index];
        }
        return getCharacters;
    }
}
