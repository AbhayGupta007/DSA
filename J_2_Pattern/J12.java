// Program to print Odd Square pattern of numbers.

package J_2_Pattern;

import java.util.Scanner;

public class J12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            int j = (i * 2) - 1;

            for (int k = 1; k <= n; k++) 
            {
                System.out.print(j + " ");
                j += 2;
                if (j > (n * 2) - 1) 
                {
                    j = 1;
                }
            }
            System.out.println();
            s.close();
        }
    }
}