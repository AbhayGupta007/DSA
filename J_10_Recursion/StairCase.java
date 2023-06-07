package J_10_Recursion;

import java.util.Scanner;

public class StairCase {
    public static int ways(int n )
    {
        if(n<0)
        {
            return 0 ;
        }
        if(n == 0)
        {
            return 1;
        }
        int op1 = ways(n-1);
        int op2 = ways(n-2);
        int op3 = ways(n-3);
        return op1 + op2 + op3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(ways(n));
        s.close();
    }
}
