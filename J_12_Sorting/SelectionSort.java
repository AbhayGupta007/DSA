// Program for Selection Sort using function.

package J_12_Sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void selectionsort(int array[])
    {
        for(int i = 0; i < array.length - 1; i++)        // Or it can be for "arr.length" only too.
        {
            int temp;
            for(int j= i+1; j < array.length ; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i =0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        selectionsort(arr);
        printArray(arr);
        s.close();
    }
}