package J_10_Recursion;

public class remove_fromString {
    public static String replace1(String s, char a)
    {
        if(s.length() == 0)
        {
            return s;
        }
        String b = replace1(s.substring(1), a);
        if(s.charAt(0) == a)
        {
            return b;
        }
        else{
            return s.charAt(0) + b;
        }
    } 
    public static void main(String[] args) {
        String s = "abhay gupta";
        String s1 = replace1(s, 'a');
        System.out.println(s1);
    }
}