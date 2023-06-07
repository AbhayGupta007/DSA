package J_23_PriorityQueue_2;

import java.util.ArrayList;
import J_22_PriorityQueue_1.Element;

public class Operate {
    public static void main(String[] args) {
        HeapSort_MinHeap<Integer> heap = new HeapSort_MinHeap<>();
        ArrayList<Element<Integer>> list =  new ArrayList<>();
        for(int i =1; i < 6; i++)
        {
            Element<Integer> ele = new Element<Integer>(i, i);
            list.add(ele);
        }
        heap.takeinput(list);
        heap.printheap();
        heap.heapsort();
        System.out.println();
        heap.printheap();
    }
}
