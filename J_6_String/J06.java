// Program to find all sub-strings (Method-1). (My method)

package J_6_String;

public class J06 {
    public static void main(String[] args) 
    {
        String str = "abcd";
        int n = str.length();
        for(int i = 1; i<=n ; i++)
        {
            for(int j = 0, k =i; k <= str.length(); j++, k++)
            {
                System.out.print(str.substring(j, k)+" ");
            }
        }
    }
}