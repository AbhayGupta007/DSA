package J_16_Queue.Using_array;

public class queueuse {
    public static void main(String[] args) {
        queue queue = new queue();
        for(int i = 1; i<=10; i++)
        {
            queue.enqueue(i);
        }
        System.out.println(queue.size());
        while(!queue.isEmpty())
        {
            System.out.print(queue.dequeue()+ " ");
        }
        System.out.println();
        System.out.println(queue.isEmpty());
        
    }
}
