package J_4_Arrays;

public class Pair_sum {
    public static void merge(int a[], int b[], int c[])
    {
        int i = 0, j = 0, k = 0;
        while( i < b.length && j < c.length)
        {
            if(b[i]>=c[j])
            {
                a[k] = c[j];
                k++;j++;
            }
            else{
                a[k] = b[i];
                k++;i++;
            }
        }
        if(i != b.length)
        {
            for(; i < b.length; i++)
            {
                a[k] = b[i];
                k++;
            }
        }
        if(j != c.length)
        {
            for(; j < c.length; j++)
            {
                a[k] = c[j];
                k++;
            }
        }
    }
    public static void mergesort(int a[])
    {
        if(a.length <= 1)
        {
            return;
        }
        int b[] = new int[a.length/2];
        int c[] = new int[a.length - b.length];
        for(int i = 0; i<a.length/2 ; i++)
        {
            b[i] = a[i];
        }
        for(int i = a.length/2; i<a.length; i++)
        {
            c[i - (a.length/2)] = a[i];
        }
        mergesort(b);
        mergesort(c);
        merge(a,b,c);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,3,4,5,8,9,9,9,15}; 
        int num = 12;
        int count1 = 0, count2 = 0;
        
        //Two Sum
        for(int i = 0; i < arr.length - 2; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == num)
                {
                    count1++;
                }
            }
        }
        System.out.println(count1);
        mergesort(arr);

        //ThreeSum
        for(int i = 0; i < arr.length - 2 ; i++)
        {
            for(int j = i + 1; j < arr.length - 1; j++)
            {
                for(int k = j + 1; k < arr.length; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == num)
                    {
                        count2++;
                    }
                }
            }
        }
        System.out.println(count2);
    }
}