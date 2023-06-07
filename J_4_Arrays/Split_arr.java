package J_4_Arrays;

public class Split_arr {
    public static boolean cansplit(int arr[], int index, int lsum, int rsum)
    {
        if(index == arr.length)
        {
            return lsum == rsum;
        }
        if(arr[index] % 5 == 0)
        {
            rsum += arr[index];
        }
        else if(arr[index] % 3 == 0)
        {
            lsum += arr[index];
        }
        else
        {
            return (cansplit(arr, index+1, lsum + arr[index], rsum) || cansplit(arr, index+1, lsum , rsum + arr[index]));
        }
        return cansplit(arr, index+1, lsum, rsum);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        if(cansplit(a,0,0,0))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}