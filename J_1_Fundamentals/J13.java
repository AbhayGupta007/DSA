//Program to find square root.

package J_1_Fundamentals;
import java.util.Scanner;
import java.lang.Math;


public class J13 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();

        System.out.print(Math.sqrt(n));
        s.close();
    }
}