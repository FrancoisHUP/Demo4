import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void newStackIsEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

}
