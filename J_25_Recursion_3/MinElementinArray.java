package J_25_Recursion_3;

import java.util.Scanner;

public class MinElementinArray {
    public static int minele(int arr[], int startindex)
    {
        if(startindex == arr.length)
        {
            return Integer.MAX_VALUE;
        }
        int minelement = minele(arr, startindex+1);
        if(minelement > arr[startindex])
        {
            return arr[startindex];
        }
        else
        {
            return minelement;
        }
    }
    public static void method2(int arr[], int s, int minsofar)
    {
        if(s == arr.length)
        {
            System.out.println(minsofar);
            return;
        }
        if(arr[s] < minsofar)
        {
            minsofar = arr[s];
        }
        method2(arr, s+1, minsofar);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(minele(arr, 0));
        s.close();
    }
}
