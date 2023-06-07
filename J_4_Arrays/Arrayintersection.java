package J_4_Arrays;

public class Arrayintersection {
    public static void sort(int a[])
    {
        if(a.length <=1)
        {
            return ;
        }
        int b[] = new int[a.length/2];
        int c[]= new int[a.length - b.length];
        for(int i = 0; i<a.length/2; i++)
        {
            b[i] = a[i];
        }
        for(int i= (a.length/2); i < a.length ; i++)
        {
            c[i - (a.length/2)] = a[i];
        }
        sort(b);
        sort(c);
        merge(a,b,c);
    }

    public static void merge(int a[], int b[], int c[])
    {
        int i = 0, j = 0, k = 0;
        while (i < b.length && j < c.length)
        {
            if(b[i] > c[j])
            {
                a[k] = c[j];
                j++;k++;
            }
            else
            {
                a[k] = b[i];
                i++;k++;
            }
        }
        if(i != b.length)
        {
            for(; i<b.length;i++)
            {
                a[k] = b[i];
                k++;
            }
        }
        if(j != c.length)
        {
            for(; j < c.length;j++)
            {
                a[k] = c[j];
                k++;
            }
        }
    }

    public static void printarr(int a[])
    {
        for(int i= 0; i<a.length ; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
    
    public static void intersection(int a[], int b[])
    {
        int i = 0, j = 0;
        while ( i < a.length  && j < b.length )
        {
            if(a[i] == b[j])
            {
                System.out.print(a[i]+ " ");
                i++;j++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
        } 
    }

    public static void main(String[] args) 
    {
        int a[] = {2, 6, 1, 2};
        int b[] = {1, 2, 3, 4, 2};
        sort(a);
        sort(b);
        printarr(a);
        System.out.println();
        printarr(b);
        System.out.println();
        intersection(a, b);
    }
}