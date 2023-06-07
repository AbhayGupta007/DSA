//Pattern of alphabets.

package J_2_Pattern;

import java.util.Scanner;

public class J02 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++)
        {   
            int k = i;
            for(int j = 1; j<=n; j++)
            {
                System.out.print((char)(k+64)+" ");
                k++;
            }
            System.out.println();
        }
        s.close();
    }
}