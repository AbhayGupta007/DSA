package J_7_OOPS.Dynamic_Array;

public class DynamicArray {
    private int data[];
    private int nextelementindex;

    public DynamicArray() 
    {
        data = new int[5];
        nextelementindex = 0;
    }

    public int size() 
    {
        return nextelementindex;
    }

    public int get(int i) 
    {
        if (i >= nextelementindex) 
        {
            return -1;
        }
        else 
        {
            return data[i];
        }
    }

    public void set(int i , int num)
    {
        if(i >= nextelementindex)
        {
            return;
        }
        else
        {
            data[i] = num;
        }
    }

    public void add(int num)
    {
        if(nextelementindex == data.length)
        {
            doublecapacity();
        }
        data[nextelementindex] = num;
        nextelementindex++;
    }

    private void doublecapacity() 
    {
        int temp[] = data;
        data = new int[ 2 * temp.length];
        for(int i = 0 ; i< temp.length; i++)
        {
            data[i]= temp[i];
        }
    }

    public int removeLast()
    {
        if(nextelementindex == 0)
        {
            return -1;
        }
        int num = data[nextelementindex-1];
        data[nextelementindex-1] = 0;
        nextelementindex--;
        return num;
    }

    public boolean isEmpty()
    {
        return nextelementindex == 0;
    }
}