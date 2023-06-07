package J_7_OOPS.Polynomial;

public class polynomial {
    private int data[];

    public polynomial()
    {
        data = new int[5];
    }

    public void doublesize()
    {
        int temp[] = data;
        data = new int[ 2 * temp.length];
        for(int i = 0; i<temp.length; i++)
        {
            data[i] = temp[i];
        }
    }
    
    public void setcoefficient(int degree , int coefficient)
    {
        if(degree >= data.length)
        {
            doublesize();
        }
        data[degree] = coefficient;
    }

    public void print()
    {
        for(int i = 0; i<data.length; i++)
        {
            if(data[i] != 0)
            {
                System.out.print(data[i] + "x^" + i+ " + ");
            }
        }
        System.out.println();
    }

    public int[] getdata()
    {
        return data;
    }

    public void add(polynomial p2)
    {
        for(int i = 0; i < p2.getdata().length; i++)
        {
            if(p2.getdata()[i] != 0)
            {
                data[i] = data[i] + p2.getdata()[i];
            }
        }
    }
    
    public void multiply(polynomial p1)
    {
        int tempdata[] = new int[100];
        for(int i = 0; i < p1.data.length; i++)
        {
            if(p1.data[i] != 0)
            {
                for(int j = 0; j < data.length; j++)
                {
                    if(data[j] != 0)
                    {
                        int tempdegree = i + j;
                        int tempcoefficient = data[j] * p1.data[i];
                        tempdata[tempdegree] = tempcoefficient;
                    } 
                }
            }
        }
        this.data = new int[100];
        for(int i = 0; i < tempdata.length; i++)
        {
            this.data[i] = tempdata[i];
        }
    }
}