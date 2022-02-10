import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;
    @Before
    public void setUp(){
        stack = new Stack();
    }
    @Test
    public void newStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void onePush_isNotEmpty(){
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = Stack.UnderFlow.class)
    public void popOnEmptyStack_WillThrowException() throws Stack.UnderFlow {
        stack.pop();
    }

    @Test
    public void afterPushX_PopX() throws Stack.UnderFlow {
        stack.push(0);
        assertEquals(stack.pop(), 0);
        stack.push(1);
        assertEquals(stack.pop(), 1);
    }

    @Test
    public void towPushesOnePop_WillNotBeEmpty() throws Stack.UnderFlow {
        stack.push(0);
        stack.push(1);
        stack.pop();
        assertFalse(stack.isEmpty());
    }


}
