//Program to check if the number entered is a part of the fibonacci series.

package J_3_Functions;

import java.util.Scanner;

public class J02 {
    public static boolean fibcheck(int n)
    {
        int n3, n1 = 0, n2 = 1;
        for(; ;)
        {
            n3 = n1 +n2;
            n1=n2;
            n2=n3;
            if(n == n3 )
            {
                return true;
            }
            if(n<n3)
            {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibcheck(n);
        s.close();
    }
}
