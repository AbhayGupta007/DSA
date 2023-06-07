//Program to check if the given number is prime or not using boolean recursion.

package J_3_Functions;
import java.util.Scanner;

public class J05 {
    public static Boolean checkprime(int n){
        for(int i = 2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean a = checkprime(n);
        System.out.println(a);
        s.close();
    }
}