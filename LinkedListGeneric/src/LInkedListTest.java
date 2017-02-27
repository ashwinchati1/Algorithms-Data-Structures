import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ashwin on 2/26/2017.
 */
public class LInkedListTest {

    @Test
    public void testIfEmpty(){
        GenericLinkedList link = new GenericLinkedList();
        assertEquals(true,link.isEmpty());
    }

    @Test
    public void testSize(){
        GenericLinkedList link = new GenericLinkedList();
        link.add(1);
        link.add(2);
        assertEquals(2,link.size());
    }

    @Test
    public void testAdd(){
        GenericLinkedList link = new GenericLinkedList();
        link.add(1);
        assertEquals(1,link.getLast());
    }

    @Test
    public void testRemoveLast(){
        GenericLinkedList link = new GenericLinkedList();
        link.add(1);
        link.add(2);
        assertEquals(1,link.removeLast());
    }

    @Test
    public void testGetLast(){
        GenericLinkedList link = new GenericLinkedList();
        link.add(1);
        link.add(3);
        link.add(2);
        assertEquals(2,link.getLast());
    }
}
