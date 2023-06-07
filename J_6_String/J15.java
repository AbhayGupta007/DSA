// Program to find minimum size word from the given string.

package J_6_String;

public class J15 {
    public static void main(String[] args) {
        String input = "This is a String";

        String str = "";
        int length = Integer.MAX_VALUE, n = input.length();
        int j = 0, k = 0;

        for (int i = 0; i < n; i++) 
        {
            if (input.charAt(i) == ' ') 
            {
                k = i - j;
                if (k < length) 
                {
                    length = k;
                    str = input.substring(j, i);
                }
                j = i + 1;
            }
        }
        k = input.substring(j, n).length();
        if (k < length) 
        {
            length = k;
            str = input.substring(j, n);
        }
        System.out.println(str);
    }
}
