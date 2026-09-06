import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack myStack;
    @BeforeEach
    public void startWith(){
        myStack = new Stack();
    }
    @Test
    public void testThatStackIsEmpty() {
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void testIPushXAndTheStackIsNotEmpty(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void testIPushXAndPopTheStackIsEmpty(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void testIPushXYAndPopYX(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        myStack.push("Zakariyah");
        assertFalse(myStack.isEmpty());

        assertFalse(myStack.isEmpty());
        assertEquals("Zakariyah", myStack.pop());
        assertEquals("Abdulkadir", myStack.pop());

    }
    @Test
    public void testPopEmptyStackThrowsException(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class,() -> myStack.pop());
    }
    @Test
    public void testPush3ElementsPeekToCheckTheLastElement(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        myStack.push("Zakariyah");
        myStack.push("Opeyemi");

        assertEquals("Opeyemi", myStack.peek());
    }
    @Test
    public void push3ElementsPop1PeekToCheckTheElementOnTop(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        myStack.push("Zakariyah");
        myStack.push("Opeyemi");
        myStack.pop();
        assertEquals("Zakariyah", myStack.peek());
    }
    @Test
    public void peekAnEmptyStackThrowsException(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class,() -> myStack.peek());
    }
    @Test
    public void searchForXReturnsThePositionInStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        myStack.push("Zakariyah");
        myStack.push("Opeyemi");

        assertEquals(1, myStack.search("Zakariyah"));
    }
    @Test
    public void searchForYReturnsMinus1_YNotInTheStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("Abdulkadir");
        myStack.push("Zakariyah");

        assertEquals(-1, myStack.search("Opeyemi"));
    }
}
