// Program for Binary Search.

package J_11_Searching;

import java.util.Scanner;

public class J03 {
    public static int binarysearch(int array[], int x )
    {
        int start = 0, end = array.length - 1, mid;
        while(start <= end)
        {
            mid = ((start + end)/2);
            if(array[mid] > x)
            {
                end = mid - 1;
            }
            else if(array[mid] < x)
            {
                start = mid +1;
            }
            else if(array[mid] == x)       // or it can only be "else" statement.
            {
                return mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n1 = s.nextInt();
        int arr[] = new int[n1];
        System.out.print("Enter elements: ");
        for(int i = 0; i<n1; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter number to search: ");
        int n2 = s.nextInt();
        System.out.println(binarysearch(arr, n2));
        s.close();
    }
}