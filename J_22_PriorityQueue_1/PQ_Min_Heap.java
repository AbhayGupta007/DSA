package J_22_PriorityQueue_1;

import java.util.ArrayList;

public class PQ_Min_Heap<T> {
    private ArrayList<Element<T>> heap;

    public PQ_Min_Heap()
    {
        heap = new ArrayList<Element<T>>();
    }

    public void insert(T value, int priority){
        Element<T> e = new Element<T>(value, priority);
        heap.add(e);
        upheapify();
    }

    private void upheapify(){
        int childindex = heap.size() -1;
        int parentindex = (childindex - 1)/2;
        while(childindex > 0)
        {
            if(heap.get(parentindex).priority > heap.get(childindex).priority)
            {
                swap(childindex, parentindex);
                childindex = parentindex;
                parentindex = (childindex - 1)/2;
            }
            else{
                return;
            }
        }
    }

    public T removemin()
    {
        if(isEmpty())
        {
            return null;
        }
        Element <T> temp = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        downheapify();
        return temp.value;
    }

    private void downheapify(){
		int parentindex = 0;
		int leftchildindex = (2*parentindex)+1;
		int rightchildindex = (2*parentindex)+2;

		while(leftchildindex <= size()-1 && rightchildindex <= size() -1)
		{
			if(heap.get(parentindex).priority > heap.get(leftchildindex).priority && heap.get(parentindex).priority > heap.get(rightchildindex).priority)
			{
				if(heap.get(leftchildindex).priority < heap.get(rightchildindex).priority)
				{
					swap(leftchildindex, parentindex);
	
					parentindex = leftchildindex;
				}
				else
				{
					swap(rightchildindex, parentindex);
					parentindex = rightchildindex;
				}
			}
			else if(heap.get(parentindex).priority > heap.get(leftchildindex).priority)
			{
				swap(leftchildindex, parentindex);
				parentindex = leftchildindex;
			}
			else if(heap.get(parentindex).priority > heap.get(rightchildindex).priority)
			{
				swap(rightchildindex, parentindex);
				parentindex = rightchildindex;
			}
			leftchildindex = (2*parentindex)+1;
			rightchildindex = (2*parentindex)+2;
		}
        if(leftchildindex <= size() - 1)
        {
            if(heap.get(leftchildindex).priority < heap.get(parentindex).priority)
            {
                swap(leftchildindex, parentindex);
            }
        }
	}

    /*
    public void downHeapify()
    {
        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        int minIndex = 0;
        while(leftChildIndex<heap.size()){
            
            if(heap.get(leftChildIndex) < heap.get(minIndex) ) {
				minIndex = leftChildIndex;
			}
            if( rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex) ) {
				minIndex = rightChildIndex;
			}
            if(minIndex!=parentIndex) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(minIndex));
				heap.set(minIndex,  temp );
				parentIndex = minIndex;
				leftChildIndex = 2*parentIndex + 1;
				rightChildIndex = 2*parentIndex + 2;
			}else {
				break;
			}
        }
	}
    */
    
    private void swap(int i, int j)
    {
        Element<T> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
    public T getmin()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return heap.get(0).value;
        }
    }

    public void printheap()
    {
        for(Element<T> i : heap)
        {
            System.out.print(i.value + " ");
        }
    }

    public int size()
    {
        return heap.size();
    }

    public boolean isEmpty()
    {
        if(size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}