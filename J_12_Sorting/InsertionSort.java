package J_12_Sorting;
import java.util.Scanner;
public class InsertionSort 
{
    public static void insertionsort(int array[])
    {
        for(int i = 0 ; i < array.length-1; i++)
        {
            int temp;
            for(int j = i+1; j>0; j--)
            {
                if(array[j-1]>array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
                else
                {
                    break;
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
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i =0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        insertionsort(arr);
        printArray(arr);
        s.close();
    }
}