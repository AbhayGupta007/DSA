// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 

package J_5_Arrays_2D;
import java.util.Scanner;
public class J11 {
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
    public static void spiralprint(int arr[][])
    {
        int rowstart = 0, rowend = arr.length -1, colstart = 0, colend = arr[0].length - 1;
        int count = 0, i = 0, j = 0;
        while(count <= (arr.length * (arr[0].length)))
        {
            for(j = colstart; j <= colend; j++)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }rowstart++; j--;

            if(count == arr.length * (arr[0].length))
            {
                return;
            }

            for(i = rowstart; i<=rowend; i++)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }colend--; i--;

            if(count == arr.length * (arr[0].length))
            {
                return;
            }

            for(j = colend; j>=colstart; j--)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }rowend--; j++;
            
            if(count == arr.length * (arr[0].length))
            {
                return;
            }
            
            for(i = rowend; i>=rowstart; i--)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }colstart++; i++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = input();
        printarr(arr);
        spiralprint(arr);
    }
}