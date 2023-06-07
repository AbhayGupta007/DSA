//Binary search using recursion.

package J_11_Searching;

public class binarysearch {
    public static int binary(int arr[], int s, int e, int n )
    {
        if(arr.length == 1)
        {
            return -1;
        }
        else
        {
            int mid = (s + e)/2;
            if(arr[mid] == n)
            {
                return mid;
            }
            else if(arr[mid] > n)
            {
                return binary(arr, s, mid -1, n);
            }
            else
            {
                return binary(arr, mid+1, e, n);
            }  
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(binary(arr,0,arr.length -1, 4));
    }
}
