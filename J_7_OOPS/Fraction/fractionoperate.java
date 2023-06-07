package J_7_OOPS.Fraction;

import java.util.Scanner;

import J_9_Execptions.dividebyzeroexception;

public class fractionoperate {
    public static void main(String[] args) throws dividebyzeroexception {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int den = s.nextInt();
        if (den == 0) {
            System.out.println("Denominator cannot be zero.");
            s.close();
            return;
        }
        fraction f1 = new fraction(num, den);
        f1.print();
        
        System.out.print("Enter number to increment with: ");
        int inc = s.nextInt();
        f1.increment(inc);

        s.close();
    }
}