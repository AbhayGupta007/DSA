package J_6_String;

import java.util.Scanner;

public class J03 {
    public static void printchar(String str)
    {
        for(int i = 1; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        System.out.print("Input 1: "+ str1);
        // System.out.println(str1);

        System.out.print("Input 2: ");
        String str2 = s.nextLine();
        printchar(str2);
        s.close();
    }
}