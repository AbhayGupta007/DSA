//Program to convert binary number to decimal number.

package J_1_Fundamentals;

import java.util.Scanner;

public class J12 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec = 0;
        for(int i = 1; n!=0 ; i=i*2)
        {
            dec = dec + ((n % 10)*i);
            n/=10;
        }
        System.out.print(dec);
        s.close();
    }
}
