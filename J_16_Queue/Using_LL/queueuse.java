package J_16_Queue.Using_LL;

public class queueuse {
    public static void main(String[] args) {
        queue<Integer> queue = new queue<Integer>();
        for (int i = 1; i < 11; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}