package J_7_OOPS.Generics.Boundedgenerics;

public class Student implements printinterface {
    int rollnumber; 
    public Student(int num)
    {
        rollnumber = num;
    }
    
    public void print() {
        System.out.println(rollnumber);
    }
}
