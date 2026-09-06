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
    @Test
    public void IAddABCDE_QueueIsFull_AddF_ThrowsException(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
        assertTrue(myQueue.add("Second Task"));
        assertTrue(myQueue.add("Third Task"));
        assertTrue(myQueue.add("Fourth Task"));
        assertTrue(myQueue.add("Fifth Task"));

        assertThrows(IllegalArgumentException.class,() -> myQueue.add("Sixth Task"));
    }
    @Test
    public void IAddXY_RetrievesXTest(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First Task"));
        assertFalse(myQueue.isEmpty());
        assertTrue(myQueue.add("Second Task"));
        assertEquals(myQueue.element(), "First Task");
    }
    @Test
    public void IRetrieveXFromEmptyQueue(){
        assertThrows(IllegalArgumentException.class, () -> myQueue.element());
    }
    @Test
    public void IAddXToTheQueue_usingOffer_QueueIsNotEmpty(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First task"));
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void IAddXYToTheQueue_usingOffer_QueueIsNotEmpty(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First task"));
        assertTrue(myQueue.offer("Second task"));
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void IAddABCDE_QueueIsFull_AddF_ReturnsSpecialValue_usingOffer(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First Task"));
        assertTrue(myQueue.offer("Second Task"));
        assertTrue(myQueue.offer("Third Task"));
        assertTrue(myQueue.offer("Fourth Task"));
        assertTrue(myQueue.offer("Fifth Task"));
        assertFalse(myQueue.offer("Sixith Task"));
    }
    @Test
    public void IAddXYToTheQueue_usingAdd_IAddZUsingOffer(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First task"));
        assertTrue(myQueue.add("Second task"));
        assertTrue(myQueue.offer("Third task"));
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void IAddABCDE_QueueIsFull_UsingOfferAddF_throwsExceptionUsingAdd(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First Task"));
        assertTrue(myQueue.offer("Second Task"));
        assertTrue(myQueue.offer("Third Task"));
        assertTrue(myQueue.offer("Fourth Task"));
        assertTrue(myQueue.offer("Fifth Task"));
        assertThrows(IllegalArgumentException.class,() -> myQueue.add("Sixth Task"));
    }
    @Test
    public void IAddABCDE_QueueIsFull_UsingOfferAndAdd_AddF(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First Task"));
        assertTrue(myQueue.add("Second Task"));
        assertTrue(myQueue.offer("Third Task"));
        assertTrue(myQueue.add("Fourth Task"));
        assertTrue(myQueue.offer("Fifth Task"));
        assertThrows(IllegalArgumentException.class,() -> myQueue.add("Sixth Task"));
    }
    @Test
    public void IAddABC_RetreivesA(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First Task"));
        assertTrue(myQueue.add("Second Task"));
        assertTrue(myQueue.offer("Third Task"));

        assertEquals(myQueue.peek(), "First Task");
    }
    @Test
    public void IRetrievesA_FromEmptyQueue(){
        assertTrue(myQueue.isEmpty());
        assertNull(myQueue.peek());
    }
    @Test
    public void addAB_RetrievesA_and_ItRemovesAFromTheQueueTest(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First task"));
        assertTrue(myQueue.add("Second task"));
        assertFalse(myQueue.isEmpty());
        assertEquals(myQueue.poll(), "First task");
    }
    @Test
    public void addABC_RetrievesAB_and_ItRemovesABFromTheQueueTest(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First task"));
        assertTrue(myQueue.add("Second task"));
        assertTrue(myQueue.add("Third task"));
        assertFalse(myQueue.isEmpty());
        assertEquals(myQueue.poll(), "First task");
        assertEquals(myQueue.poll(), "Second task");
    }
    @Test
    public void retrieveAndRemoveXFromEmptyQueue(){
        assertTrue(myQueue.isEmpty());
        assertNull(myQueue.poll());
    }
    @Test
    public void addXRetrievesX_RemoveXTest(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.add("First task"));
        assertEquals(myQueue.remove(), "First task");
    }
    @Test
    public void removeXFromEmptyQueue(){
        assertTrue(myQueue.isEmpty());
        assertTrue(myQueue.offer("First Task"));
        assertTrue(myQueue.offer("Second Task"));
        assertTrue(myQueue.offer("Third Task"));
        assertTrue(myQueue.offer("Fourth Task"));
        assertTrue(myQueue.offer("Fifth Task"));
        assertEquals(myQueue.remove(), "First Task");
        assertEquals(myQueue.remove(), "Second Task");
        assertEquals(myQueue.remove(), "Third Task");
        assertEquals(myQueue.remove(), "Fourth Task");
        assertEquals(myQueue.remove(), "Fifth Task");
        assertThrows(IllegalArgumentException.class,() -> myQueue.remove());

    }






}

