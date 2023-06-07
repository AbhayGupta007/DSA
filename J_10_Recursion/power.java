package J_10_Recursion;

import java.util.Scanner;

public class power {
    public static int power1(int x, int n) 
    {
        if (n == 1) 
        {
            return x;
        } 
        else if (n == 0) 
        {
            return 1;
        } 
        else 
        {
            return x * power1(x, n - 1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(power1(a, b));
        s.close();
    }
}
