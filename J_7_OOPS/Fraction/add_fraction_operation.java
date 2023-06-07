package J_7_OOPS.Fraction;

import J_9_Execptions.dividebyzeroexception;

public class add_fraction_operation {
    public static void main(String[] args) throws dividebyzeroexception {
        addfraction f1 = new addfraction(4,24);
        addfraction f2 = new addfraction(9,18);
        f1.print();
        f2.print();

        /*Method 1
        int b = f1.dengetter() * f2.dengetter();
        int a = (    (f1.numgetter() * f2.dengetter())    +    (f2.numgetter() * f1.dengetter())   );
        addfraction f3 = new addfraction(a, b);
        f3.print();*/

        /* Method 2 
        f1.add(f2);
        f1.print();
        */

        /* Method 3*/
        addfraction f3 =  addfraction.add(f1, f2);
        f3.print();

        addfraction f4 = addfraction.multiply(f1, f2);
        f4.print();

        addfraction f5 = addfraction.division(f1,f2);
        f5.print();
    }
}