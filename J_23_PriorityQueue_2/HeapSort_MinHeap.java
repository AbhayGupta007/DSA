package J_23_PriorityQueue_2;

import java.util.ArrayList;
import J_22_PriorityQueue_1.Element;

public class HeapSort_MinHeap<T> {
    ArrayList<Element<T>> heap;
    
    public HeapSort_MinHeap(){
        heap = new ArrayList<>();
    }
    
    public void takeinput(ArrayList<Element<T>> arr){
        for(Element<T> i : arr)
        {
            heap.add(i);
        }
    }

    public void buildheap()
    {
        for(int i = 0 ; i < heap.size(); i++)
        {
            int childindex = i;
            int parentindex = (childindex - 1 )/2;
            upheapify(parentindex, childindex);
        }
    }
    
    private void upheapify(int parentindex, int childindex)
    {
        while(childindex > 0)
        {
            if(heap.get(parentindex).priority > heap.get(childindex).priority)
            {
                swap(childindex,parentindex);
                childindex = parentindex;
                parentindex = (childindex - 1)/2;
            }
            else
            {
                return;
            }
        }
    }

    public void heapsort()
    {
        for(int i = heap.size() -1; i >= 0; i--)
        {
            Element<T>temp = heap.get(i);
            heap.set(i, heap.get(0));
            heap.set(0, temp);
            downheapify(i);
        }
    }


    private void downheapify(int endindex)
    {
        int parentindex = 0;
        int leftchildindex = (2 * parentindex)+1;
        int rightchildindex = (2 * parentindex)+2;
        
        while(leftchildindex < endindex)
        {
            int minindex = parentindex;
            if(heap.get(leftchildindex).priority < heap.get(minindex).priority)
            {
                minindex = leftchildindex;
            }
            if(rightchildindex < endindex && heap.get(rightchildindex).priority < heap.get(minindex).priority)
            {
                minindex = rightchildindex;
            }
            if(minindex != parentindex)
            {
                swap(minindex, parentindex);
                parentindex = minindex;
                leftchildindex = (2*parentindex)+1;
                rightchildindex = (2*parentindex)+2;
            }
            else
            {
                break;
            }
        }
    }

    public void printheap()
    {
        for(Element<T> i : heap)
        {
            System.out.print(i.value+" ");
        }
    }

    
    void swap(int i , int j){
        Element<T> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}