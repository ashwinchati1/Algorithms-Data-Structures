/**
 * Created by ashwin on 2/25/2017.
 */
public class GenericLinkedList<E> {

    private Node head = null;
    private int size = 0;

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    public int size(){
        return size;
    }


    public void add(E data){
        Node node = new Node(data, null);
        if(isEmpty()){
            head = node;
        }else{
            Node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        size++;
    }

    public void addAtPosition(E data, int position){
        Node node = new Node(data,null);
        Node temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
        size++;
    }

    public E removeLast(){
        Node temp = null;
        if(!isEmpty()){
            temp = head;
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
        size--;
        return (E)temp.getData();
    }

    public E removeAtPosition(int position){
        Node temp = null;
        if(!isEmpty()){
            temp = head;
            for(int i=0; i<position-1; i++){
                temp =temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
        return (E)temp.getData();
    }

    public E getLast(){
        if(!isEmpty()){
            Node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            return (E)temp.getData();
        }else{
            return null;
        }
    }
}
