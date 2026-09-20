import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayList list;
    @BeforeEach
    void startWith(){
        list = new ArrayList();
    }
    @Test
    void testThatTheArrayListIs_Empty(){
        assertTrue(list.isEmpty());
    }
    @Test
    void testThatIAddX_toTheList(){
        assertTrue(list.isEmpty());
        list.add(5);
        assertFalse(list.isEmpty());
    }
    @Test
    void testThatIAdXY_toTheList(){
        assertTrue(list.isEmpty());
        list.add(5);
        list.add(7);
        assertFalse(list.isEmpty());
    }
    @Test
    void testThatTheListIsFullAndICanStillAdd_TheSizeIncreases(){
        assertTrue(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add("head");
        list.add(11);
        list.add(12);
        list.add(13);
        assertEquals(13, list.size());
    }
    @Test
    void testThatIRemoveAtAnIndex(){
        assertTrue(list.isEmpty());
        list.add(12);
        list.add(22);
        list.add(31);
        list.add(42);
        list.add(10);
        list.add(24);
        list.add(21);
        list.add(43);
        list.remove(3);
        assertEquals(7, list.size());
    }
    @Test
    void testThatIRemoveAtIndexAndTheListShrinks(){
        assertTrue(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        assertEquals(13, list.size());
        list.remove(4);
        list.remove(3);
        list.remove(9);
        list.remove(6);
        assertEquals(9, list.size());
    }
    @Test
    void testThatIRemoveFromEmptyList() {
        assertTrue(list.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> list.remove(2));
    }
    @Test
    void testIGetXFromItsIndex(){
        assertTrue(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(3,list.get(2));
    }
    @Test
    void testIRemoveAllValues(){
        assertTrue(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeAll();
        assertTrue(list.isEmpty());
    }
    @Test
    void test_toRemoveFromEmpty(){
        assertTrue(list.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> list.removeAll());
    }

}
