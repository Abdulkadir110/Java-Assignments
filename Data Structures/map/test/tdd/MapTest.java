import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    private Map myMap;
    @BeforeEach
    void startWith(){
        myMap = new Map();
    }
    @Test
    void testThatTheMapIs_Empty(){
        assertTrue(myMap.isEmpty());
    }
    @Test
    void IAddX_NotEmpty(){
        assertTrue(myMap.isEmpty());
        myMap.put("Rice", 14);
        assertFalse(myMap.isEmpty());
    }
    @Test
    void IAddXY_getTheIndexOfXY(){
        assertTrue(myMap.isEmpty());
        assertEquals(0,myMap.put("Rice", 19));
        assertEquals(1,myMap.put("Beans", 5));
    }
    @Test
    void IAddXY_And_CantAddX_again(){
        assertTrue(myMap.isEmpty());
        assertEquals(0,myMap.put("Rice", 19));
        assertEquals(1,myMap.put("Beans", 5));
        assertEquals(0,myMap.put("Rice", 5));
    }
    @Test
    void IAdd_11_Keys_with_11Values_toMakeTheMapGrow(){
        assertTrue(myMap.isEmpty());
        assertEquals(0,myMap.put("Rice", 19));
        assertEquals(1,myMap.put("Beans", 5));
        assertEquals(2,myMap.put("Pasta", 4));
        assertEquals(3,myMap.put("Yam", 2));
        assertEquals(4,myMap.put("Eba", 5));
        assertEquals(5,myMap.put("Semo", 4));
        assertEquals(6,myMap.put("Tomato", 11));
        assertEquals(7,myMap.put("Macs", 7));
        assertEquals(8,myMap.put("Akara", 9));
        assertEquals(9,myMap.put("Pap", 15));
        assertEquals(10,myMap.put("Pepper", 6));
        assertEquals(11,myMap.put("Pando", 12));
    }
    @Test
    void IAddXYZ_And_RemoveY_TheSize_reduces(){
        assertTrue(myMap.isEmpty());
        myMap.put("Rice", 19);
        myMap.put("Beans", 5);
        myMap.put("Macs", 12);
        myMap.remove("Rice");
        assertEquals(2, myMap.size());
    }
    @Test
    void IAddXYZ_CheckIfYIsPresent(){
        assertTrue(myMap.isEmpty());
        myMap.put("Rice", 19);
        myMap.put("Beans", 5);
        myMap.put("Macs", 12);
        assertTrue(myMap.containsKey("Macs"));
    }
    @Test
    void IAddXYZ_CheckIf_y_IsPresent(){
        assertTrue(myMap.isEmpty());
        myMap.put("Rice", 19);
        myMap.put("Beans", 5);
        myMap.put("Macs", 12);
        assertFalse(myMap.containsKey("macs"));
    }
    @Test
    void IAdd_11_Keys_11Values_Remove(){
        assertTrue(myMap.isEmpty());
        myMap.put("Rice", 19);
        myMap.put("Beans", 5);
        myMap.put("Pasta", 4);
        myMap.put("Yam", 2);
        myMap.put("Eba", 5);
        myMap.put("Semo", 4);
        myMap.put("Tomato", 11);
        myMap.put("Macs", 7);
        myMap.put("Akara", 9);
        myMap.put("Pap", 15);
        myMap.put("Pepper", 6);
        myMap.put("Pando", 12);
        myMap.remove("Akara");
        assertEquals(11, myMap.size());
        assertTrue(myMap.containsKey("Pando"));
        assertFalse(myMap.containsKey("Akara"));
        assertTrue(myMap.containsKey("Pap"));

    }
}
