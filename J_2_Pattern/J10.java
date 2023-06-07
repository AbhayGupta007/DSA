//  Program to print N number of rows for Half Diamond pattern using stars and numbers.

package J_2_Pattern;

import java.util.Scanner;

public class J10
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n>=0 && n <=50)
        {
            System.out.print("*\n");
            for(int i=1; i <= n; i++)
            {
                System.out.print("*");
                for(int j = 1; j<= i; j++)
                {
                    System.out.print(j);
                }
                for(int j = i-1; j>=1; j--)
                {
                    System.out.print(j);
                }
                System.out.print("*\n");
            }
            for(int i =1; i<n; i++)
            {
                System.out.print("*");
                for(int j =1; j<=n-i; j++)
                {
                    System.out.print(j);
                }
                for(int j = n-i-1; j>=1; j--)
                {
                    System.out.print(j);
                }
                System.out.print("*\n");
            }
            System.out.print("*");
        }
        s.close();
    }
}