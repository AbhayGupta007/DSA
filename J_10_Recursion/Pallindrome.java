package J_10_Recursion;

public class Pallindrome {
    public static Boolean check(String s)
    {
        String rev1 = rev(s);
        return s.equals(rev1);
    }
    public static String rev(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        String small = rev(s.substring(1));
        return small + s.charAt(0);
    }
    public static void main(String[] args) {
        String s = "abhay";
        String rev = rev(s);
        System.out.println(rev);
        System.out.println(check(s));
    }
}
