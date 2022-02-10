import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void createStack(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

}
