// Remove given character from the string.

package J_6_String;

public class J12 
{
    public static StringBuffer removechar(String str, char ch)
    {
        StringBuffer str1 = new StringBuffer("");
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ch)
            {
                str1.append(str.charAt(i)) ;
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "aabccbba";
        char ch = 'a';
        StringBuffer ans = removechar(str, ch);
        System.out.println(ans);
    }
}