//Program to find Odd one out.

package J_4_Arrays;

public class J10 {
    public static int oddone(int arr[])
    {
        int n = arr[0];
        for (int i = 1; i < arr.length; i++)
            n = n ^ arr[i];
        return n;
    }
    public static void main(String[] args) {
        int arr [] = {2, 3, 1, 6, 3, 6, 2};
        System.out.println(oddone(arr));
    }
}
