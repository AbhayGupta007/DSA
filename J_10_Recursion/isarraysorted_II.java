package J_10_Recursion;

public class isarraysorted_II {
    public static boolean check(int arr[], int start)
    {
        if(start == arr.length - 1)
        {
            return true ;
        }
        if(arr[start] > arr[start + 1])
        {
            return false;
        }
        return check(arr, start+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5, 10, 9};
        System.out.println(check(arr,0));
    }
}
