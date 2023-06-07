package J_10_Recursion;

import java.util.Scanner;

public class fibonacci {
    
    public static int fib(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else if( n == 0)
        {
            return 0;
        }
        return fib(n-1) + fib(n-2); 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print(fib(i)+" ");
        }
        s.close();
    }
}