//Program to find greatest common divisor(GCD) of two numbers.


package J_1_Fundamentals;

import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        int gcd = 1;
        
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println(gcd);
        s.close();
    }
}