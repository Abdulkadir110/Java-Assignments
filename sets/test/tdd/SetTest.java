import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    void startWith(){
        set = new Set();
    }
    @Test
    void testThatTheSetIs_Empty(){
        assertTrue(set.isEmpty());
    }
    @Test
    void testIAddXY_AndTheSetIsNotEmpty(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertFalse(set.isEmpty());
    }
    @Test
    void testIAddXYX_AndTheSetRejectX_again(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertFalse(set.add(8));
        assertFalse(set.isEmpty());
    }
    @Test
    void testIAddXYZ_And_CheckIf_YIs_InSet(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertTrue(set.add(10));
        assertTrue(set.contains(7));
    }
    @Test
    void testIAddXYZ_And_CheckIf_W_exist(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertTrue(set.add(10));
        assertFalse(set.contains(9));
    }
    @Test
    void testIAddXYZ_And_CheckForTheSize(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertTrue(set.add(10));
        assertEquals(3, set.size());
    }
    @Test
    void testIAddXYZ_And_RemoveY_TheSizeBecame2(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertTrue(set.add(10));
        assertTrue(set.remove(7));
        assertEquals(2, set.size());
    }
    @Test
    void testIAddXYZ_And_ClearAll_ThenSetIsEmpty(){
        assertTrue(set.isEmpty());
        assertTrue(set.add(8));
        assertTrue(set.add(7));
        assertTrue(set.add(10));
        set.clear();
        assertTrue(set.isEmpty());
    }

}
