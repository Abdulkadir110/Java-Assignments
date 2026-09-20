import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList list;
    @BeforeEach
    void startWith(){
        list = new LinkedList();
    }
    @Test
    void testThatListIs_Empty(){
        assertEquals(0, list.size());
    }
    @Test
    void testThatIAddX_TheSizeIncreases(){
        list.addLast(9);
        assertEquals(1, list.size());
    }
    @Test
    void testThatIAddXYZ_AndCheckIfYIsPresent(){
        list.addLast(5);
        list.addLast(9);
        list.addLast(10);
        assertTrue(list.contains(9));
        assertTrue(list.contains(10));
        assertFalse(list.contains(20));
    }
    @Test
    void testThatIAddWXYZ_And_getA_data_WithItsIndex(){
        list.addLast(5);
        list.addLast(9);
        list.addLast(10);
        list.addLast(12);
        assertEquals(10, list.get(2));
    }
    @Test
    void testThatIAddXYZ_And_IAddW_ToTheHead(){
        list.addLast(5);
        list.addLast(9);
        list.addLast(10);
        list.addFirst(12);
        assertEquals(12, list.get(0));
        assertEquals(4, list.size());
    }
    @Test
    void testThatIAdd_CBA_TheSizeIncreases(){
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        assertEquals(3,list.size());
    }
    @Test
    void testToCheckTheFIrstElementIntheList(){
        list.addLast(5);
        list.addLast(9);
        assertEquals(5, list.element());
    }
    @Test
    void testThatIRemoveYFromTheList(){
        list.addLast(5);
        list.addLast(9);
        list.addLast(10);
        list.addFirst(12);
        assertTrue(list.remove(2));
    }
}
