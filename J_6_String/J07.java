// Program to find all sub-strings (Method-2).  (CodingNinja's Method)

package J_6_String;

public class J07 {
    public static void main(String[] args) {
        String str = "abcd";
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i; j <str.length(); j++)
            {
                System.out.print(str.substring(i, j+1)+" ");
            }
        }
    }
}