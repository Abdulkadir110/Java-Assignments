import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
 
public class TestContactListManager {
 ContactListManager manager;
 
    @BeforeEach
    public void instantiateTheObject() {
        manager = new ContactListManager();
    }
 
    @Test
    public void testThatWhenIaddMyContactToThePhoneBookItReflected() {
        manager.addNewContactTo("Abdulkadir", "080903402010");
 
        String[] expectedContact = {"Abdulkadir", "080903402010"};
        ArrayList<String[]> actual = manager.displayContactIn();
 
        
        assertEquals(1, actual.size());
        assertArrayEquals(expectedContact, actual.get(0));
    }
 
    @Test
    public void testMultipleContactsCanBeAdded() {
        manager.addNewContactTo("Abdulkadir", "080903402010");
        manager.addNewContactTo("Chinedu", "081112223334");
        
        String[][] actualContacts = {
            {"Abdulkadir", "080903402010"},
            {"Chinedu", "081112223334"}
        };
 
        assertEquals(2, manager.displayContactIn().size());
        assertArrayEquals(manager.displayContactIn(), actualContacts);

    }
}
