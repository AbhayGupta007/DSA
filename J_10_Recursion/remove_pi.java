package J_10_Recursion;

public class remove_pi {
    public static String replacepi(String s)
    {
        if(s.length()<=1)
        {
            return s;
        }
        if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
        {
            String temp = replacepi(s.substring(2));
            return "3.14" + temp;
        }
        else
        {
            String temp = replacepi(s.substring(1));
            return s.charAt(0) + temp;
        }
    }

    public static void main(String[] args) 
    {
        String a = "mistpithupi";
        String b = replacepi(a);
        System.out.println(b);
    }
}