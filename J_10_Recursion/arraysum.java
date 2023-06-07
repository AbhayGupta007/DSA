package J_10_Recursion;

import java.util.Scanner;

public class arraysum {
    public static int sum(int arr[])
    {
        
        if(arr.length == 1)
        {
            return arr[0]; 
        }
        int temp[] = new int[arr.length -1];
        for(int i = 1; i < arr.length; i++)
        {
            temp [i-1] = arr[i];
        }
        return arr[0] + sum(temp); 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i =0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Total sum of all elements is: " + sum(arr));
        s.close();
    }
}