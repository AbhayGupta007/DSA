package J_4_Arrays;
public class Duplicates_in_array
{
    public static int findDuplicate(int arr[]) {
		mergesort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == arr[i+1])
			{
				return arr[i];
			}
		}
		return -1;
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
    public static void printarr(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {0, 3, 1, 5, 4, 3, 2};
        System.out.println(findDuplicate(a));
        printarr(a);
    }
}