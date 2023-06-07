package J_16_Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class reverseQueue {
    public static void reversequeue(Queue<Integer> input) {
		if (input.peek() == null) {
			return;
		}
		int temp = input.remove();
		reversequeue(input);
		input.add(temp);
	}
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        reversequeue(q);
        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
}
