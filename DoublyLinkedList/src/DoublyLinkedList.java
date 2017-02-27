/**
 * Created by ashwin on 2/26/2017.
 */
public class DoublyLinkedList<E> {

    private static Node head = null;
    private Node tail = null;
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
        Node node = new Node(data, null, tail);
        if(isEmpty()){
            head = node;
            tail = head;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void addAtFirst(E data){
        Node node = new Node(data, null, null);
        if(isEmpty()){
            head = node;
            tail = head;
        }else{
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addAtPosition(E data, int position){
        Node node = new Node(data, null, null);
        if(!isEmpty()){
            Node temp = head;
            for(int i=0; i<position-1; i++){
                temp = temp.getNext();
            }
            node.setPrev(temp);
            node.setNext(temp.getNext());
        }
        size++;
    }

    public E removeFirst(){
        if(!isEmpty()){
            head = head.getNext();
        }
        return (E)head.getData();
    }

    public E removeLast(){
        if(!isEmpty()){
            tail = tail.getPrev();
            tail.setNext(null);
        }
        return (E)tail.getData();
    }

    public E removeAtPosition(int position){
        Node temp = head;
        for(int i=1; i<position-1; i++){
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        return (E)temp.getNext().getData();
    }

    public void iterateForward(){
        if(!isEmpty()){
            Node temp = head;
            System.out.print(temp.getData()+" ");
            while(temp.getNext()!=null){
                temp = temp.getNext();
                System.out.print(temp.getData()+" ");
            }
        }
    }

    public void iterateBackward(){
        if(!isEmpty()){
            Node temp = tail;
            System.out.print(temp.getData()+" ");
            while(temp.getPrev()!=null){
                temp = temp.getPrev();
                System.out.print(temp.getData()+" ");
            }
        }
    }

    public E getElement(int position){
        Node temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.getNext();
        }
        return (E)temp.getData();
    }

    public E getTail(){
        return (E)tail.getData();
    }
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeLast();
        System.out.println(list.getTail());

    }

}
