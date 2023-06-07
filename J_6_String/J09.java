// Program to reverse string word wise and each word of string.

package J_6_String;

public class J09 {
    public static String reverseWordWise(String input) {
		String ans = "";
        int j = 0;
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                String word = "";
                for(; j<i; j++)
                {
                    word = word + input.charAt(j);
                }
                ans = " " + word + ans;
                j = i+1;
            }
        }
        String word = "";
        for(; j<input.length(); j++)
        {
            word = word + input.charAt(j);
        }
        ans = word + ans;
        return ans;
    }

    public static String reverseword(String str) 
    {
        String ans = "";
        int j = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' ') 
            {
                String reverseword = "";
                for (; j < i; j++) 
                {
                    reverseword = str.charAt(j) + reverseword;
                }
                ans = ans + reverseword + " ";
                j = i + 1;
            }
        }
        String reverseword = "";
        for (; j < str.length(); j++) 
        {
            reverseword = str.charAt(j) + reverseword;
        }
        ans = ans + reverseword;
        return ans;
    }

    public static void main(String[] args) {
        String name = "Welcome to Coding Ninjas";
        String rev1 = reverseword(name);
        String rev2 = reverseWordWise(name);
        System.out.println(rev1);
        System.out.println(rev2);
    }
}