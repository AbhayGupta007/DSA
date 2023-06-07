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
    }
}