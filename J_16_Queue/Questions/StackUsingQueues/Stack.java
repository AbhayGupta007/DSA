package J_16_Queue.Questions.StackUsingQueues;
import java.util.LinkedList;
import java.util.Queue;
public class Stack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    private int size;

    public Stack(){
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        size = 0;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(int elem){
        q2.add(elem);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        size++;
    }
    public int pop(){
        if(size == 0)
        {
            return -1;
        }
        size--;
        return q1.remove();    
    }
    public int top() {
        if(size == 0 )
        {
            return -1;
        }
        return q1.peek();
    }
}
