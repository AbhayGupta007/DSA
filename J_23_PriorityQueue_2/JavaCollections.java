package J_23_PriorityQueue_2;

import java.util.PriorityQueue;

public class JavaCollections {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int arr[] = {1, 8, 6, 7, 3, 4, 2};
        for(int i : arr)
        {
            pq.add(i);
        }
        for(int i : pq)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+" ");
            pq.poll();
        }
    }
}