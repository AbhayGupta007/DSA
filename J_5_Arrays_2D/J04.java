// Program to take input in 2D Array using function and printing it out also.

package J_5_Arrays_2D;

import java.util.Scanner;

public class J04 {
    public static int[][] inputarr()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.print("Enter elements: ");
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<cols; j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        s.close();
        return arr;
    }
    public static void printarray2d(int arr[][])
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int arr[] [] = inputarr();;
        System.out.println("Reference of 2D array is: "+arr);
        System.out.println("Number of rows: "+arr.length);
        System.out.println("Number of columns: "+arr[0].length);
        printarray2d(arr);        
    }
}
