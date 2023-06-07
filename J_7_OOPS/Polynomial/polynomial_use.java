package J_7_OOPS.Polynomial;

public class polynomial_use {
    public static void main(String[] args) {
        polynomial p1 = new polynomial();
        p1.setcoefficient(0,3);
        p1.setcoefficient(2,2);
        p1.print();
        
        polynomial p2 = new polynomial();
        p2.setcoefficient(2,2);
        p2.setcoefficient(0,3);
        p2.setcoefficient(1,4);
        p2.setcoefficient(2,5);
        p2.print();

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();

        // polynomial p3 = polynomial.add(p1,p2);
        // p3.print();
        // p1.print();
        // p2.print();

        // int ans = p2.evaluate(10);
        // System.out.println(ans);
    }
}