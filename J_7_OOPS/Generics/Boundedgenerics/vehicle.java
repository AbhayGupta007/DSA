package J_7_OOPS.Generics.Boundedgenerics;

public class vehicle implements printinterface{
    int maxspeed;
    String company;
    public vehicle(int maxspeed, String company)
    {
        this.company = company;
        this.maxspeed = maxspeed;
    }
    public vehicle(){}
    public void print(){
        System.out.println(maxspeed + " " + company);
    }
}