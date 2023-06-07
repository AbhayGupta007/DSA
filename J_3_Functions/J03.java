// Program to understand Pass by Value

package J_3_Functions;

public class J03 
{
    public static void c(int n)
    {
        n++;
        System.out.println("Inside c "+ n);
    }
    public static void b(int n )
    {
        c(n);
        n++;
        System.out.println("Inside b " + n);
    }
    public static void a(int n )
    {
        b(n);
        n++;
        System.out.println("Inside a " + n);
    }
    public static void main(String[] args) {
        int n = 10; 
        a(n);
        System.out.println("Inside main: "+n);
    }
}
