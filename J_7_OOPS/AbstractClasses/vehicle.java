package J_7_OOPS.AbstractClasses;

public abstract class vehicle {
    private String colour;
    int maxspeed;
    protected String name;
    
    public String getcolour()
    {
        return colour;
    }
    public void setcolour(String colour)
    {
        this.colour = colour;
    }
    public void print(){
        System.out.println("Vehicle "+ "colour "+ colour +" maxspeed "+ maxspeed);
    }
    
    public abstract boolean ismotorized();
    
    // public abstract String getcompany(String n);
}