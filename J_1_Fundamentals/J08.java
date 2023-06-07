/*Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5. */

package J_1_Fundamentals;

import java.util.Scanner;

public class J08 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int sumEven = 0;
        int sumOdd = 0; 
        
        if(n >= 0 && n <=100000000)
        {
            while(n!=0)
            {
                if(n % 2 == 0)
            	{
                	sumEven += (n % 10);
                	n = n / 10;
            	}
            	else 
            	{
                	sumOdd += (n % 10);
                	n = n / 10;
            	}
            }
        }
        System.out.println(sumEven + " " + sumOdd);
        s.close();
    }
}
