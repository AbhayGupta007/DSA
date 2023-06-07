// Program for introduction to buffer string.

package J_6_String;

public class J08 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
        str.setCharAt(2, 's');
        str.append("def");
        System.out.println(str);

        char c = 'p';
        for(int i = 0; i<5; i++)
        {
            str.append(c);
            c++;
        }
        System.out.println(str);
    }
}