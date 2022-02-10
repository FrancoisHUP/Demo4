import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

}
