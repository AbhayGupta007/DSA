package J_10_Recursion;

public class check_number_in_array {
    public static boolean check(int arr[], int x)
    {
        if(arr.length == 1 )
        {
            if(arr[0] == x)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        if(arr[0] == x)
        {
            return true;
        }
        int temp [] = new int[arr.length -1];
        for(int i = 1; i < arr.length; i++)
        {
            temp [i-1] = arr[i];
        }
        
        return check(temp, x);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int x = 3;
        System.out.println(check(arr, x));
    }
}
