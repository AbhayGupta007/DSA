// Program for Bubble Sort using function.

package J_12_Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int array[])
    {
        for(int i = array.length-1; i >=0; i--)
        {
            int temp;
            for(int j =0; j<i; j++)
            {
                if(array[j]>array[j+1])
                {
                    //Swap
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
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
        bubblesort(arr);
        printArray(arr);
        s.close();
    }
}
