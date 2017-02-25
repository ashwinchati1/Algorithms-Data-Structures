package queue;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ashwin on 2/24/2017.
 */
public class GenericQueueTest {

    @Test
    public void testIfEmpty(){
        GenericQueue queue = new GenericQueue(1);
        assertEquals(true,queue.isEmpty());
        queue.enqueue(100);
        assertEquals(false,queue.isEmpty());
    }

    @Test
    public void testIfFull(){
        GenericQueue queue = new GenericQueue(1);
        assertEquals(false,queue.isFull());
        queue.enqueue(100);
        assertEquals(true,queue.isFull());
    }

    @Test
    public void testSize(){
        GenericQueue queue = new GenericQueue(1);
        assertEquals(0,queue.size());
        queue.enqueue(100);
        assertEquals(1,queue.size());
    }

    @Test
    public void testEnqueue(){
        GenericQueue queue = new GenericQueue(1);
        queue.enqueue(1);
        assertEquals(1,queue.peek());
    }

    @Test
    public void testDequeue(){
        GenericQueue queue = new GenericQueue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(2,queue.peek());
    }

    @Test
    public void testPeek(){
        GenericQueue queue = new GenericQueue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1,queue.peek());
    }
}
