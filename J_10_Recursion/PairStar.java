package J_10_Recursion;

public class PairStar {
    public static String pairstar(String s)
    {
        if(s.length() == 1)
        {
            return s;
        }
        String a = pairstar(s.substring(1));
        if(s.charAt(0) == a.charAt(0))
        {
            return s.charAt(0) + "*" + a;
        }
        else{
            return s.charAt(0)  + a;
        }
    }
    public static void main(String[] args) {
        String s = "chappal";
        String a = pairstar(s);
        System.out.println(a);
    }
}
