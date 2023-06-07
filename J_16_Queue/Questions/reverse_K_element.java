package J_16_Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class reverse_K_element {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		if (k > 1) 
		{
            Queue<Integer> q = new LinkedList<Integer>();
            while(k>=1)
            {
                q.add(input.remove());
                k--;
            }
            reverseQueue(q);
            while(!input.isEmpty())
            {
                q.add(input.remove());
            }
            return q;
		}
		else{
			return input;
		}
	}

	public static void reverseQueue(Queue<Integer> input) {
		if (input.peek() == null) {
			return;
		}
		int temp = input.remove();
		reverseQueue(input);
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
        Queue<Integer> q1  = reverseKElements(q, 3);
        while(!q1.isEmpty())
        {
            System.out.println(q1.poll());
        }
    }
}
