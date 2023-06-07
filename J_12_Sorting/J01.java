// Program to sort all the zeroes in the end.

package J_12_Sorting;

public class J01 
{
    public static void sortzeroes(int arr[])
    {
        int start = 0, end = arr.length-1;

        while(start <= end)
        {
            while(arr[end] == 0)
            {
                end--;
            }
            if(arr[start] == 0)
            {
                for(int i = start; i<end; i++)
                {
                    arr[i] = arr[i+1];
                }
                arr[end] = 0;
                end--;
            }
            else if(arr[start] != 0)
            {
                start++;
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int array[] = {5 ,0, 7, 4 ,8, 1, 3, 0 ,7 ,2 ,0};
        sortzeroes(array);
        printArray(array);;
    }
}