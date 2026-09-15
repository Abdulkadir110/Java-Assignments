import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEqual;

public class TestLibraryBookTracker {
    @Test
    public void testThatTheLibraryIsEmpty() {
        LibraryBookTracker tracker = new LibraryBookTracker();
        String[] library = new String[30];
        
        tracker.addBookTo("Java");
        
        String result = tracker.searchForBookIn("Harry Potter");
        assertEquals("Available", result);
    } 
    @Test
    public void TestThatIAddAndRemoveABookInTheLibrary() {
        
        tracker.addBookTo("Dune");
 
        
        tracker.removeBookIn("Dune");
 
        
        String result = tracker.searchForBookIn("Dune");
        assertEquals("Not Available", result);
    }
}
