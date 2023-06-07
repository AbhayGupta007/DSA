package J_1_Fundamentals;

import java.util.Scanner;

public class J03 
{
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        // String str1 = s.next();
        // System.out.println(str1);
        
        String str = s.next();
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println(str);
        // int a, b;
        // a = s.nextInt();
        // b = s.nextInt();
        // int c=a+b;
        // System.out.println(c);
        s.close();
    }
}