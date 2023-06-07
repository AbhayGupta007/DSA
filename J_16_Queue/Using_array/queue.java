package J_16_Queue.Using_array;

public class queue {
    private int[] data;
    private int size;
    private int front;
    private int rear;

    public queue(){
        data = new int[5];
        front = -1;
        rear = -1;
    }
    public queue(int capacity)
    {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }
    private void doublecapacity()
    {
        int temp[] = data;
        data = new int[temp.length * 2];
        int index = 0;
        for(int i = front; i < temp.length; i++)
        {
            data[index++] = temp[i];
        }
        for(int i = 0; i < front - 1 ; i++)
        {
            data[index++] = temp[i];
        }
        front = 0; 
        rear = temp.length - 1;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int front()
    {
        if(size == 0)
        {
            return -1;
        }
        return data[front];
    }
    public int rear(){
        if(size == 0)
        {
            return -1;
        }
        return data[rear];
    }
    public void enqueue(int num)
    {
        if(size == data.length)
        {
            doublecapacity();
        }
        if(size == 0)
        {
            front = 0;
        }
        rear = ( rear + 1 ) % data.length;
        data[rear] = num;
        size++;
    }
    public int dequeue()
    {
        if(size == 0)
        {
            front = -1;
            rear = -1;            
            return -1;
        }
        size--;
        int temp = data[front];
        front = (front + 1) % data.length;
        return temp;
    }
}