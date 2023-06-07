package J_7_OOPS.AbstractClasses;

public class car extends vehicle{
    int numdoors;
    public void print()
    {
        super.print();
        System.out.println("Car "+ "color "+ getcolour()+ " maxspeed "+ maxspeed+ " numdoors "+ numdoors);
    }
    public boolean ismotorized() {
        return true;
    }
}