package J_7_OOPS.Fraction;

import J_9_Execptions.dividebyzeroexception;

public class fraction {
    private int numerator;
    private int denominator;
    
    public fraction(int numerator, int denominator) throws dividebyzeroexception
    {
        if(denominator == 0 )
        {
            throw new dividebyzeroexception();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(this.numerator, this.denominator);
    }
    private void simplify(int a, int b) {
        for(int i = 1; i <= a && i<= b; i++)
        {
            if(a % i ==0 && b % i ==0)
            {
                numerator = a/i;
                denominator = b/i;
            }
        }
    }
    public void increment(int a)
    {
        numerator = numerator + (denominator * a);
        simplify(numerator, denominator);
        System.out.println("After incrementing fraction is: "+numerator+"/"+denominator);
    }
    public void print(){
        System.out.println("Fraction is: "+numerator + "/" + denominator);
    }
}
