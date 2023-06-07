package J_16_Queue.Using_LL;
import J_14_LinkedList.node;

public class queue<T> {
    private node<T> front;
    private node<T> rear;
    private int size;

    public queue(){
        front = null;
        rear = null; 
        size = 0;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public T front(){
        if(front == null)
        {
            return null;
        }
        return front.data;
    }
    public T rear(){
        return rear.data;
    }
    
    public void enqueue(T elem)
    {
        node<T> newnode = new node<T>(elem);
        if(front == null)
        {
            front = newnode;
            rear = newnode;
        }else{    
            rear.next = newnode;
            rear = newnode;
        }
        size++;
    }
    
    public T dequeue()
    {
        if(front ==  null || rear == null)
        {
            return null;
        }
        T temp = front.data;
        front = front.next;
        size--;
        return temp;
    }
}