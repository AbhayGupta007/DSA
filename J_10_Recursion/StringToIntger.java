package J_10_Recursion;

public class StringToIntger {
    public static int sti(String s)
    {
        if(s.length() == 1)
        {
            return s.charAt(0) - 48;
        }
        int ans = sti(s.substring(1));
        return (((int)s.charAt(0) - 48) * (int) Math.pow(10, s.length() - 1)) + ans;
    }
    public static void main(String[] args) {
        String s = "16193";
        System.out.println(sti(s)); 
    }
}
