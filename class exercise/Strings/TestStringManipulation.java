import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringManipulation{
    @Test
    public void testThatE_Occurs3times(){
        StringManipulation demo = new StringManipulation();
    
        String word = "Village People";
        char letter = 'e';
        
        assertEquals(demo.numberOfTheLetterIn(word,letter), 3);
    }
    @Test
    public void testThatL_Occurs3times(){
        StringManipulation demo = new StringManipulation();
    
        String word = "Village People";
        char letter = 'l';
        
        assertEquals(demo.numberOfTheLetterIn(word,letter), 3);
    }
    @Test
    public void testThatP_Occurs2times(){
        StringManipulation demo = new StringManipulation();
    
        String word = "Village People";
        char letter = 'p';
        
        assertEquals(demo.numberOfTheLetterIn(word,letter), 2);
    }
    
}
