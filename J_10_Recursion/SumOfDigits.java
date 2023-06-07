package J_10_Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n)
    {
        if(n/10 == 0)
        {
            return n % 10;
        }
        else 
        {
            return (n % 10) + sum(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sum(n));
        s.close();
    }
}
