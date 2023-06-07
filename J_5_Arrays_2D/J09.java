// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
package J_5_Arrays_2D;

import java.util.Scanner;

public class J09 {
    public static int[][] input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        System.out.print("Enter elements: ");
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        return arr;
    }
    public static void printarr(int arr[][])
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int totalsum(int arr[][])
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length - 1 || i == j || j == arr[i].length - 1 - i)
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int arr[][] = input();
        printarr(arr);
        System.out.println(totalsum(arr));
    }
}