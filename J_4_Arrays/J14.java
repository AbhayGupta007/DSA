// Program to for sorting 0, 1 and 2.

package J_4_Arrays;

public class J14 
{
    public static void sort012_(int arr[]) 
    {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == 0) 
            {
                count0++;
            } 
            else if (arr[i] == 1) 
            {
                count1++;
            } 
            else 
            {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) 
        {
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count1; i++) 
        {
            arr[i] = 1;
        }
        for (int i = count0+count1; i < count0+count1+count2; i++) 
        {
            arr[i] = 2;
        }
    }

    public static void printArray(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = { 2, 1, 0, 1, 2, 0 };
        sort012_(arr);
        printArray(arr);
    }
}
