// Program for Linear search using function.

package J_11_Searching;

import java.util.Scanner;

public class J02 {
    public static int[] readarray()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sizer of array: ");
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
    public static boolean checkarray(int array[], int n)
    {
        for(int i = 0; i< array.length; i++)
        {
            if(n == array[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = readarray();
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        boolean a = checkarray(arr, n);
        System.out.println(a);
        c.close();
    }
}