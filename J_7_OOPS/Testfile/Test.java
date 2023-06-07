package J_7_OOPS.Testfile;

public class Test {
    int a;
    int b;
    Test()
    {
        this(10,20);
        System.out.println("consructor one ");
    }
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("constructor two ");
    }
}
