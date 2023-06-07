//Program to compress string.

package J_6_String;

public class J14 {
    public static String compresstring(String str)
    {
        String ans = "";
        int count = 1; 
         
        for(int i = 1; i<str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    ans = ans + str.charAt(i-1) + count;
                }
                else{
                    ans = ans + str.charAt(i-1);
                }
                count = 1;
            }
        }
        if(count>1)
        {
            ans = ans + str.charAt(str.length()-1) + count;
        }
        else
        {
            ans = ans + str.charAt(str.length()-1);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        String str = "aaaddb";
        String output = compresstring(str);
        System.out.println(output);
    }
}
