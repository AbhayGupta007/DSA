package J_10_Recursion;

public class removeDuplicates_String {
    public static String removee(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        String temp = removee(s.substring(1));
        if(s.charAt(0) == temp.charAt(0))
        {
            return temp;
        }
        else
        {
            return s.charAt(0) + temp;
        }
    }
    public static void main(String[] args) {
        String s = "xxxyyyzwwzzz";
        String s1 = removee(s);
        System.out.println(s1);
    }
}
