/**
 * Created by ashwin on 2/24/2017.
 */
public class GenericStack<E> {


    private E[] stack;
    private int topOfStack = -1;

    public GenericStack(int size){
        stack =(E[]) new Object[size];
    }

    public GenericStack(){
        stack =(E[]) new Object[10];
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack == stack.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(E valueToPush){
        if(!isFull()){
            topOfStack++;
            stack[topOfStack] = valueToPush;
        }else{
            System.out.println("Stack is full..");
        }
    }

    public E pop(){
        if(!isEmpty()){
            return stack[topOfStack--];
        }else{
            return null;
        }
    }

    public E peek(){
        if(stack.length != 0){
            return stack[topOfStack];
        }else{
            return null;
        }
    }

    public int size(){
        return topOfStack+1;
    }
}
