//Program to print iinverted pattern of numbers.

package J_2_Pattern;
import java.util.Scanner;
public class J04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = n; i>= 1; i--)
        {
            for(int j = 1; j <=i ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        s.close();
    }
}
