package J_7_OOPS.Fraction;

import J_9_Execptions.dividebyzeroexception;

public class addfraction {
    private int numerator;
    private int denominator;
    public  addfraction(int x , int y) throws dividebyzeroexception{
        if(y == 0)
        {
            throw new dividebyzeroexception();
        }
        numerator = x;
        denominator = y;
        simplify(x,y);
    }
    private void simplify(int a ,int b) 
    {
        int gcd = 1; 
        for(int i = 1; i <= a &&  i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;    
    }
    
    public int dengetter()
    {
        return denominator;
    }
    
    public int numgetter()
    {
        return numerator;
    }
    
    public void add(addfraction f2)
    {
        /*Method 2 */
        System.out.print("Addition: ");
        numerator = ((numerator * f2.denominator) + (denominator * f2.numerator));
        denominator = denominator * f2.denominator;
        simplify(numerator,denominator);
    }

    public static addfraction add(addfraction a, addfraction b) throws dividebyzeroexception
    {
        /* Method 3*/
        System.out.print("Addition: ");
        int newnum =((a.numerator * b.denominator) + (a.denominator * b.numerator));
        int newden = a.denominator * b.denominator;
        addfraction f3 = new addfraction(newnum, newden);
        return f3;
    }

    public static addfraction multiply(addfraction f1, addfraction f2) throws dividebyzeroexception
    {
        System.out.print("Multiplication: ");
        int newnum = f1.numerator * f2.numerator;
        int newden = f1.denominator * f2.denominator;
        addfraction f3 = new addfraction(newnum, newden);
        return f3;
    }
    
    public static addfraction division(addfraction f1, addfraction f2) throws dividebyzeroexception
    {
        System.out.print("Division: ");
        int newnum = f1.numerator * f2.denominator;
        int newden = f1.denominator * f2.numerator;
        addfraction f3 = new addfraction(newnum, newden);
        return f3;
    }

    public void print()
    {
        System.out.println(numerator+"/"+denominator);
    }
}
