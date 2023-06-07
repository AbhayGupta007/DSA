package J_10_Recursion;

public class isarraysorted {
    public static boolean isorted(int arr[])
    {
        if (arr.length == 1)
        {
            return true;
        }
        if (arr[0] > arr[1])
        {
            return false;
        }
        int temp[] = new int[arr.length -1];
        for(int i =1; i<arr.length; i++)
        {
            temp[i-1] = arr[i];
        }
        boolean istrue = isorted(temp);
        return istrue;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10,5};
        System.out.println(isorted(arr));
    }
}