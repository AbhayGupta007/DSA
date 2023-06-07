package J_7_OOPS.Basics;

public class Student {
    String name ;
    private int rollno;
    public int getrollno()
    {
        return rollno;
    }

    /*public void setrollno(int num)
    {
        if(num <= 0)
        {
            return;
        }
        rollno = num;
    }*/
    
    public void setrollno(int rollno)
    {
        if(rollno <= 0)
        {
            return;
        }
        this.rollno = rollno;
    }
}