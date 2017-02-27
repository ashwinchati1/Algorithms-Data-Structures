import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

/**
 * Created by ashwin on 2/27/2017.
 */
public class DoublyLinkedListTest {

    @Test
    public void testIfEmpty(){
        DoublyLinkedList list = new DoublyLinkedList();
        assertEquals(true,list.isEmpty());
        list.add(1);
        assertEquals(false,list.isEmpty());
    }

    @Test
    public void testSize(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        assertEquals(1,list.size());
    }

    @Test
    public void testAdd(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        assertEquals(2,list.size());
    }

    @Test
    public void testAtPositionAdd(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addAtPosition(6,3);
        assertEquals(3,list.getElement(3));
    }

    @Test
    public void testRemoveFirst(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeFirst();
        assertEquals(2,list.getElement(1));
    }

    @Test
    public void testRemoveLast(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(3,list.removeLast());
    }

    @Test
    public void testRemoveAtPosition(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(3,list.removeAtPosition(2));
    }
}
