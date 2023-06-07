//To check nhumber is Prime or not

package J_1_Fundamentals;

import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isPrime = true;
        int n = s.nextInt();
        int i = 2;
        while (i <= n/2) {
            if (n % i == 0) 
            {
                isPrime = false;
                break;
                // System.out.println("Number is not prime.");
                // return;
            } 
            else
            {
                isPrime= true;
            }
            i++;
        }
        
        // System.out.println("Number is prime.");
        
        if(!isPrime)
        {
            System.out.println("Number is not prime.");
        }
        else{
            System.out.println("Number is prime.");
        }
        s.close();
    }
}