// Program to rotate an array by given index.

package J_4_Arrays;

public class J12 
{
    public static void arrayRotate(int arr[], int n)
    {
        int a[] = new int [n];
        int temp;
        for(int i = 0; i<n; i++)
        {
            a[i] =  arr[i];
        }
        for(int i = 0; i<arr.length - n; i++)
        {
            temp = arr[i];
            arr[i] = arr[i+n];
            arr[i+n] = temp;
        }
        for(int i =  arr.length - n, k = 0; i < arr.length; i++ )
        {
            arr[i] = a[k];
            k++;
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
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        arrayRotate(arr, d);
        printArray(arr);
    }
}
