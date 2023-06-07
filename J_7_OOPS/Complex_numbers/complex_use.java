package J_7_OOPS.Complex_numbers;

public class complex_use {
    public static void main(String[] args) {
        complex c1 = new complex(4, 5);
        c1.print();
        c1.setreal(4);
        c1.setimaginary(10);
        c1.print();

        complex c2 = new complex(2,3);
        c1.add(c2);
        c1.print();
        c2.print();

        complex c3 = new complex(2,3);
        c3.multiply(c2);
        c3.print();
        c2.print();

        complex c4 = complex.add(c1,c2);
        c1.print();
        c2.print();
        c4.print();
    }
}
