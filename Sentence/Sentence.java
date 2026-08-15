
public class Sentence {
    public static void main(String[] args) {

    }
    public static String CodeOf(String sentence) {
        String word = "";
        for(int index = 0; index < sentence.length(); index++) {
            if(sentence.chatAt(index) == " ") {
                word.charAt(index) = sentence.chatAt(index + 1);
            }

        }
        return word;
    }
}
