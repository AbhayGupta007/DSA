package J_23_PriorityQueue_2;
import java.util.PriorityQueue;
public class Kth_largest_element {
    public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for(int i = 0; i<k; i++)
		{
			p.add(input[i]);
		}
		for(int i = k; i< input.length; i++)
		{
			if(p.peek() >= input[i])
			{
				continue;
			}
			else{
				p.poll();
				p.add(input[i]);
			}
		}
		return p.poll();
	}
}