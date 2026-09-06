import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Queue;


import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue myQueue;
    @BeforeEach
    public void startWith(){
        myQueue = new Queue();
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }
    @Test
    public void IAddX_QueueNotEmpty(){
        assertTrue(myQueue.isEmpty());
        myQueue.add("First Task");
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void IAddX_returnsTrue(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void IAddXY_returnsTrue(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
        assertTrue(myQueue.add("Second Task"));
    }
    @Test
    public void IAddXYZ_returnsTrue(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
        assertTrue(myQueue.add("Second Task"));
        assertTrue(myQueue.add("Third Task"));
    }
    @Test
    public void IAddABCDE_QueueIsFull_returnsTrue(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
        assertTrue(myQueue.add("Second Task"));
        assertTrue(myQueue.add("Third Task"));
        assertTrue(myQueue.add("Fourth Task"));
        assertTrue(myQueue.add("Fifth Task"));

    }


}

