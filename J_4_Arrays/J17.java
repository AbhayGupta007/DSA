/*Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the same order they are present in the input array. */

package J_4_Arrays;

public class J17 
{
    public static void leader(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j<arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    break;
                }
                if(j == arr.length - 1)
                {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.print(arr[arr.length - 1] + " ");
    }
    public static void main(String[] args) 
    {
        int arr[] = {3,12,34,2,0,-1};
        leader(arr);
    }
}