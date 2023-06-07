// Program to print cross pattern pattern of numbers.

package J_2_Pattern;

import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (n * 2) - 1; j++)
            {
                if(j == i || j == (2*n) - i )
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i<n; i++)
        {
            for(int j = 1; j <= (2*n)-1; j++)
            {
                if(j == n - i|| j == n + i)
                {
                    System.out.print(n-i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
