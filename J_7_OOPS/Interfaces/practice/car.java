package J_7_OOPS.Interfaces.practice;

public class car extends vehicle implements vehicle_interface, carinterface {
    int numdoors;
    private int gears; 
    private String company; 

    public boolean ismotorized() 
    {
        return true;
    }

    public void setcompany(String n) 
    {
        this.company = n;
    }

    public String getcompany() 
    {
        return company;
    }

    public void printcar()
    {
        System.out.print("Car name is "+ company+ " and it is a motorized vehicle. It's color is " + color+ " and it's maxspeed is " + maxspeed + " and it has "+ numdoors+ " doors.");
    }

    public car()
    {

    }

    public car(int num, String c, String com, int speed)
    {
        numdoors  = num;
        color = c;
        company = com;
        maxspeed = speed;
    }

    public void setnumgears(int num) {
        gears = num;
    }

    public int getnumgears() {
        return gears;
    }
}