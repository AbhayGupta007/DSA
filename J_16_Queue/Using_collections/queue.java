package J_16_Queue.Using_collections;

import java.util.Queue;
import java.util.LinkedList;

public class queue{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        for(int i=1;i<5;i++)
        {
            queue.add(10+i);
        }
        System.out.print(queue.poll()+" "+queue.size());

    }
}