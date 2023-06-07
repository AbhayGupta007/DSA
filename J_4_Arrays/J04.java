//Program to read array using functions.
package J_4_Arrays;
import java.util.Scanner;
public class J04{
    public static int[] readarray()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i =0 ; i<size; i++)
        {
            System.out.print("Enter number at index "+ (i+1) +": ");
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }

    public static void printarray(int array[])
    {
        int n = array.length;
        for(int i = 0; i<n; i++)
        {
            System.out.println("Element at index "+ (i+1) +" is: "+ array[i]);
        }
    }
    public static void main(String[] args) 
    {       

        int array[] = readarray(); 
        System.out.println();
        printarray(array);
    }
}