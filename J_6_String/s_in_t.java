package J_6_String;

public class s_in_t {
    public static boolean checksequence(String s, String t)
    {
        if(t.length() == 0)
        {
            return true;
        }
        if(s.length() == 0)
        {
            return false;
        }
        if(s.charAt(0) == t.charAt(0))
        {
            return checksequence(s.substring(1), t.substring(1));
        }
        else
        {
            return checksequence(s.substring(1), t);
        }
    }
    public static void main(String[] args) {
        String s = "abcde";
        String t = "aeb";
        System.out.println(checksequence(s, t));
    }
}
