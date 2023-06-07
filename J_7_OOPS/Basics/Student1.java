package J_7_OOPS.Basics;

public class Student1 {
    public String name; 
    public int rollno;
    private static int stdcount = 0;
    //final public int rollno;

    public Student1(String n)
    {
        name = n;
        stdcount++;
        rollno = stdcount;
    }
    /*public Student1(String n)
    {
        name = n;
        stdcount++;
        rollno = stdcount;
    }*/
    
    public void print()
    {
        System.out.println(name+" "+rollno);
    }

    public static int getnumstd()
    {
        return stdcount;
    }
}