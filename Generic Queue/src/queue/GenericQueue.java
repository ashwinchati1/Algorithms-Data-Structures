package queue;

/**
 * Created by ashwin on 2/24/2017.
 */
public class GenericQueue<E> {

    private E[] queue;
    private int front = 0;
    private int rear = -1;

    public GenericQueue(int size){
        queue = (E[]) new Object[size];
    }

    public GenericQueue(){
        queue = (E[]) new Object[10];
    }

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(rear == queue.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(E value){
        if(!isFull()){
            rear++;
            queue[rear] = value;
        }else{
            System.out.println("Queue is full..");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            front++;
            //return queue[front];
        }else{
            System.out.println("Queue is empty..");
            //return null;
        }
    }

    public E peek(){
        if(!isEmpty()){
            return queue[front];
        }else{
            return null;
        }
    }

    public int size(){
        if(rear == -1){
            return 0;
        }else{
            return rear+1;
        }
    }
}
