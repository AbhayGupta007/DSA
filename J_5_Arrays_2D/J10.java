/*  Program to print the 2D arrat in wave form.
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
*/

package J_5_Arrays_2D;
import java.util.Scanner;
public class J10{
    public static int[][] input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = s.nextInt();
        System.out.print("Enter number of columns: ");
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        System.out.print("Enter elements: ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
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
    public static void printwave(int arr[][])
    {
        int i  = 0, j = 0;
        if(arr[0].length % 2 == 0)
        {
            while(i >= 0 && j <= arr[0].length-1)
            {
                while(i <= arr.length - 1)
                {
                    System.out.print(arr[i][j] + " ");
                    i++;
                }
                j++;i--;
                while(i >= 0)
                {
                    System.out.print(arr[i][j] + " ");
                    i--;
                }
                j++;i++;
            }
        }
        else
        {
            while(i <= arr.length-1 && j <= arr[0].length-1)
            {
                while(i <= arr.length - 1)
                {
                    System.out.print(arr[i][j] + " ");
                    i++;
                }
                i--;
                if(i == arr.length - 1 && j == arr[0].length - 1)
                {
                    return;
                }
                j++;
                while(i >= 0)
                {
                    System.out.print(arr[i][j] + " ");
                    i--;
                }
                j++;i++;
            }
        }
    }
    public static void main(String[] args){
        int arr[][] = input();
        printarr(arr);
        printwave(arr);
    }
}