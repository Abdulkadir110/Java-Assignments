import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceTest {
    
    @Test
    public void testThat() {
    //Given
	String sentence = "John is a dark young man";

	//When
	String expectedSequence = Sentence.CodeOf(sentence);

	String actualSequence = "Jiadym";

	//Check
	assertEquals(expectedSequence, actualSequence);
    }    
}
