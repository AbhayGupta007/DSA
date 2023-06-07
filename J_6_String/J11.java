// Program to remove consecutive duplicate elements in the string.

package J_6_String;

public class J11 
{
    public static void main(String[] args) 
    {
        String str1 = "aaabbcc";
        String str2 = "";
        int j = 0;

        str2 = str2 + str1.charAt(0);
        
        for(int i = 0; i<str1.length(); i++)
        {
            if(str2.charAt(j) != str1.charAt(i))
            {
                str2 = str2 + str1.charAt(i);
                j++;
            }
        }
        System.out.println(str2);
    }
}