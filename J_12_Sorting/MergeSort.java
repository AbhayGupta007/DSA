// Program for merge sort using function.

package J_12_Sorting;

import java.util.Scanner;

public class MergeSort 
{
    public static void merge(int a[], int b[], int c[])
    {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i]>= b[j])
            {
                c[k] = b[j];
                k++; j++;
            }
            else if(a[i]<= b[j])
            {
                c[k] = a[i];
                k++; i++;
            }
        }
        if(j==b.length)
        {
            for(; i<a.length; i++)
            {
                c[k] = a[i];
                k++;
            }
        }
        else if( i == a.length)
        {
            for(; j<b.length ; j++)
            {
                c[k] = a[i];
                k++;
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
        
        //Taking input for first array.
        System.out.print("Enter size of 1st array: ");
        int n1 = s.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter elements of 1st array in sorted form: ");
        for(int i=0; i<n1; i++)
        {
            arr1[i] = s.nextInt();
        }
        
        //Taking input for second array.
        System.out.print("Enter size of 2nd array: ");
        int n2 = s.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter elements of 2nd array in sorted form: ");
        for(int i=0; i<n2; i++)
        {
            arr2[i] = s.nextInt();
        }
        int arr3[] = new int[ ( n1 + n2 ) ];
        
        merge(arr1, arr2, arr3);
        printArray(arr3);
        
        s.close();
    }
}
