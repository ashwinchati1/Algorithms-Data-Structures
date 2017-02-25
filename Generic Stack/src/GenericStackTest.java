import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ashwin on 2/24/2017.
 */
public class GenericStackTest {

    @Test
    public void testStackSize(){
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        assertEquals(1,stack.size());
    }

    @Test
    public void testIfEmpty(){
        GenericStack stack = new GenericStack(1);
        assertEquals(true,stack.isEmpty());
        stack.push(1);
        assertEquals(false,stack.isEmpty());
    }

    @Test
    public void testIfFull(){
        GenericStack stack = new GenericStack(1);
        assertEquals(false,stack.isFull());
        stack.push(1);
        assertEquals(true,stack.isFull());
    }

    @Test
    public void testPush(){
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        assertEquals(1,stack.peek());
    }

    @Test
    public void testPop(){
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        stack.push(2);
        assertEquals(1,stack.pop());
    }
    @Test
    public void testPeek(){
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        assertEquals(1,stack.peek());
    }
}
