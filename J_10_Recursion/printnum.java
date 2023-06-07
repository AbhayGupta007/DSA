package J_10_Recursion;

import java.util.Scanner;

public class printnum {
    public static void printn(int n )
    {
        if(n == 0)
        {
            return ;
        }
        else
        {
            printn(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printn(n);
        s.close();
    }
}
