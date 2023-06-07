package J_16_Queue.QueueUsingStacks;

import java.util.Stack;

public class Queue <T> {
    Stack<T> s1;
    Stack<T> s2;
    private int size;
    public Queue()
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public T front(){
        if(size == 0)
        {
            return null;
        }
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        T temp =  s2.peek();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return temp;
    }
    public T rear(){
        if(size == 0)
        {
            return null;
        }
        return s1.peek();
    }
    public void enqueue(T elem)
    {
        s1.push(elem);
        size++;
    }
    public T dequeue()
    {
        if(size == 0)
        {
            return null;
        }
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        size--;
        T temp =  s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return temp;
    }
}
