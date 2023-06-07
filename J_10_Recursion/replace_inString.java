package J_10_Recursion;

public class replace_inString {
    public static String replace(String s, char a, char b)
    {
        if(s.length() == 0)
        {
            return s;
        }
        String ans = replace(s.substring(1), a, b);
        if(s.charAt(0) == a)
        {
            return b + ans;
        }
        else 
        {
            return s.charAt(0) + ans;
        }
    }
    public static void main(String[] args) {
        String s = "abhay gupta";
        String s1 = replace(s, 'a', '@');
        System.out.println(s1);
    }
}