//Program to print Diamond star pattern

package J_2_Pattern;

import java.util.Scanner;

public class J09 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n >= 0 && n <= 49 && n % 2 != 0) 
        {
            for (int i = 1; i <= (n/2)+1; i++) 
            {
                //Spaces
                for(int j = 1; j <= (n/2)-i+1; j++)
                {
                    System.out.print(" ");
                }
                //increasing star pattern
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*");
                }
                //decreasing star pattern
                for(int j = i-1; j>=1; j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 1; i<=(n/2); i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(" ");
                }
                for(int j=1; j<= n-(2*i); j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        s.close();
    }
}
