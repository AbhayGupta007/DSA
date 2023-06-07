package J_7_OOPS.Complex_numbers;


public class complex {
    private int real; 
    private int imaginary;
    
    
    public complex(int a ,int b)
    {
        real = a;
        imaginary = b;
    }
   
    public void print()
    {
        System.out.println(real+ " + "+ imaginary +"i");
    }

    public void setreal(int a)
    {
        real = a;
    }

    public void setimaginary(int a)
    {
        imaginary = a;
    }

    public void add(complex c2)
    {
        real = real + c2.real;
        imaginary = imaginary + c2.imaginary;
    }

    public void multiply(complex c2)
    {
        int newreal = (real * c2.real) - (imaginary * c2.imaginary);
        int newimaginary = (real * c2.imaginary) + (imaginary * c2.real);
        real = newreal;
        imaginary = newimaginary;
    }

    public static complex add(complex c1, complex c2)
    {
        int newreal = c1.real + c2.real;
        int newimaginary = c1.imaginary + c2.imaginary;
        complex c3 = new complex(newreal , newimaginary);
        return c3;
    }
}