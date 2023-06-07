package J_15_Stack.Using_LL;

import J_14_LinkedList.node;
import J_15_Stack.Using_Array.stackemptyexception;

public class stack_LL<T> {
    private node<T> head;
    private int size;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(T n){
        node<T> newnode = new node<T>(n);
        newnode.next = head;
        head = newnode;
        size++;
    }
    public T pop() throws stackemptyexception{
        if(size == 0)
        {
            throw new stackemptyexception();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public T top() throws stackemptyexception{
        if(size == 0)
        {
            throw new stackemptyexception();
        }
        return head.data;
    }
}
