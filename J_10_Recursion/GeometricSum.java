/* Given k, find the geometric sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) using recursion. */

package J_10_Recursion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {
    public static double gsum(int k)
    {
        if(k == 0 )
        {
            return 1;
        }
        double total = 1/Math.pow(2, k);
        return total += gsum(k-1); 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double ans = gsum(n);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
        s.close();
    }
}
