/*Program to print of input n.
if n = 4
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4 
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/


package J_2_Pattern;

import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //First Part
        for(int i = n; i >= 1; i--)
        {
            for(int j = n; j >= 1; j-- )
            {
                if(j>i)
                    System.out.print(j+" ");
                else
                    System.out.print(i+" ");
            }
            for(int j=2; j <= n ; j++ )
            {
                if(j>i)
                    System.out.print(j+" ");
                else    
                    System.out.print(i+" ");
            }
            System.out.println("");
        }
        //Second Part
        for(int i = 2 ; i <= n; i++)
        {
            for(int j = n; j >= 1; j--)
            {
                if(j>i)
                    System.out.print(j+" ");
                else
                    System.out.print(i+" ");
            }
            for( int j = 2; j <= n; j++)
            {
                if(j>i)
                    System.out.print(j+" ");
                else
                    System.out.print(i+" ");
            }
            System.out.println("");
            s.close();
        }

        // Another compatible approach.
        // for (int i = 1; i <= 2 * n - 1; i++) 
        // {
        //     for (int j = 1; j <= 2 * n - 1; j++) 
        //     {
        //         int val = n - Math.min(Math.min(i, 2 * n - i), Math.min(j, 2 * n - j)) + 1;
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }
    }
}