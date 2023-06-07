package J_7_OOPS.Interfaces.intro;

public class vehicle implements vehicle_interface{
    public String company; 
    @Override
    public boolean ismotorized() {
        return false;
    }

    @Override
    public void getcompany(String n) {
        company = n;
    }
    public void printvehicle()
    {
        System.out.println("This is vehicle content. The value of PI is "+ PI);
    }
}