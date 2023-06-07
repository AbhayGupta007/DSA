//Program to find nCr.

package J_3_Functions;

import java.util.Scanner;

public class J01 
{
    public static int fact(int n) 
    {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }
    public static int nCr(int n , int r)
    {
        int result= (fact(n)) / ((fact(r)) * (fact(n - r)));
        return result ;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int ans = nCr(n, r);

        System.out.println(ans);
        s.close();
    }
}