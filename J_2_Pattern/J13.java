package J_2_Pattern;

import java.util.Scanner;

public class J13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            for(int j = n; j>i; j--)
            {
                System.out.print("* ");
            }
            for(int j = n; j>i; j--)
            {
                System.out.print("* ");
            }
            for(int j = i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
