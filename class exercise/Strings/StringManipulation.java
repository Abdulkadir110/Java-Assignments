
public class StringManipulation {
    public int numberOfTheLetterIn(String word, char given_letter){
        word = word.toLowerCase();
        Character.toLowerCase(given_letter);
        int count = 0;
        for(int index = 0; index < word.length(); index++){
            if(word.charAt(index) == given_letter) count++;
        }
        return count;
    }
}
