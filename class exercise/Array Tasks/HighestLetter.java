public class HighestLetter {
    public static void main(String[] args) {
        String sentence = "My madam";
        char letter = 'm';
        sentence = sentence.toLowerCase(); 
        System.out.println(countTheNumberOfEachChar(sentence, letter));
    }
    public static int countTheNumberOfEachChar(String sentence, char letter) {
        int letterCount = 0;
        char [] array = sentence.toCharArray();
        for(int index = 0; index < sentence.length(); index++) {
            if(letter == array[index]) {
                letterCount++;
            }
        }
        return letterCount;
    }
}
