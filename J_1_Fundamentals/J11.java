// Program to convert decimal number to binary number.

package J_1_Fundamentals;

import java.util.Scanner;

public class J11 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long bin=0;
        long remainder, i =1;
        while(n !=0)
        {
            remainder = n % 2;
            bin = bin + (remainder * i);
            n/=2;
            i*=10;
        }
        System.out.println(bin);
        s.close();
    }
}