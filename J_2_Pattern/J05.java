//Program to print innverted pattern

package J_2_Pattern;

import java.util.Scanner;


public class J05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n ; i++)
        {
            for(int j =1; j<=n; j++)
            {
                if(j>=i)
                {
                    System.out.print("*");
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
