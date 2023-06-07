//Program for taking input of array and printing the output.

package J_5_Arrays_2D;

import java.util.Scanner;

public class J03 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<cols; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("2D entered array is: ");
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<cols; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        s.close();
    }
}
