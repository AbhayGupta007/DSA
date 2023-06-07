// Quick sort using recursion.

package J_12_Sorting;

public class QuickSort {
    public static int partition(int arr[], int s, int e)
    {
        int pivotelement = arr[s];
        int count = 0;
        for(int i = s+1; i <= e; i++)
        {
            if(pivotelement > arr[i])
            {
                count++;
            }
        }
        int temp = arr[s + count];
        arr[s + count] = pivotelement;
        arr[s] = temp;

        int i = s;
        int j = e;
        while(i<j)
        {
            if(arr[i] < pivotelement)
            {
                i++;
            }
            else if(arr[j] > pivotelement)
            {
                j--;
            }
            else
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }

        return s + count ;
    }

    public static void quicksort(int arr[], int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        int pivotindex = partition(arr, s, e);
        quicksort(arr, pivotindex + 1, e);
        quicksort(arr, s, pivotindex - 1);
    }

    public static void printarr(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,7,3};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}
