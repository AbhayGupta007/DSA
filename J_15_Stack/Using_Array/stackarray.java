package J_15_Stack.Using_Array;

public class stackarray {

    private int data[];
    private int topIndex;
    
    //Constructor - 1
    public stackarray(){
        data = new int[10];
        topIndex = -1;
    }
    //Constructor - 2
    public stackarray(int n){
        data = new int[n];
        topIndex = -1;
    }

    private void doublecapacity()
    {
        int temp[] = data;
        data = new int[temp.length * 2];
        for(int i = 0; i < temp.length; i++)
        {
            data[i] = temp[i];
        }
    }

    public void push(int elem) throws stackfullexception
    {
        /*if(topIndex == data.length-1)
        {
            // stackfullexception e = new stackfullexception();
            // throw e;
            throw new stackfullexception();
        }*/
        if(topIndex == data.length -1)
        {
            doublecapacity();
        }
        data[++topIndex] = elem;
    }
    public int pop() throws stackemptyexception
    {
        if(topIndex == -1)
        {
            throw new stackemptyexception();
        }
        // int temp = data[topIndex];
        // topIndex--;
        // return temp;
        return data[topIndex--];
    }
    public int top() throws stackemptyexception
    {
        if(topIndex == -1)
        {
            throw new stackemptyexception();
        }
        return data[topIndex];
    }   
    public int size()
    {
        return topIndex + 1;
    }
    public boolean isEmpty()
    {
        return topIndex == -1;
    }
}