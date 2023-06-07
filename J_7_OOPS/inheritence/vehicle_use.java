package J_7_OOPS.inheritence;

public class vehicle_use {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        // v.colour = "white";
        v.setcolour("white");
        v.maxspeed = 80;
        v.print();
        v.name = "Maserrati";
        
        car c = new car();
        c.setcolour("red");
        c.maxspeed = 90;
        c.numdoors = 4;
        c.print();
        
    }
}
