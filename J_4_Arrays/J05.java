//Program to find maximum number.

package J_4_Arrays;
import java.util.Scanner;
public class J05 {
    public static int[] inputArray()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int array[] = new int[n];
        System.out.print("Enter array: ");
        for(int i = 0; i<n; i++)
        {
            array[i] = s.nextInt();
        }
        s.close();
        return array;
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum number is: "+max);
    }
}
