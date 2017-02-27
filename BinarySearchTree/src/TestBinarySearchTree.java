import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ashwin on 2/27/2017.
 */
public class TestBinarySearchTree {

    @Test
    public void testIfFound(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(true,tree.findElement(2));
        assertEquals(false,tree.findElement(4));
    }

    @Test
    public void testFindMin(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(1,tree.findMinElement());
    }

    @Test
    public void testFindMax(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(3,tree.findMaxElement());
    }

    @Test
    public void testInorder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(32);
        tree.inOrderTraversal(tree.root);
    }

    @Test
    public void testpreorder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(32);
        tree.preOrderTraversal(tree.root);
    }

    @Test
    public void testpostorder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(32);
        tree.postOrderTraversal(tree.root);
    }

    @Test
    public void testdelete(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(32);
        tree.postOrderTraversal(tree.root);
        tree.removeNode(78);
        System.out.println();
        tree.postOrderTraversal(tree.root);
    }

}
