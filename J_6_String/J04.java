//Program to reverse a String and check if it is pallindrome or not.

package J_6_String;
import java.util.Scanner;
public class J04 {
    public static String reversedsring(String s)
    {
        String reversestr = "";
        for(int i = 0; i < s.length(); i++)
        {
            reversestr = s.charAt(i) + reversestr;
        }
        return reversestr;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = reversedsring(str);
        System.out.println(str1);

        System.out.println(str1.equals(str));
        s.close();
    }
}