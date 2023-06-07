package J_7_OOPS.AbstractClasses;

public class vehicleuse {
    public static void main(String[] args) {
        vehicle v;
        v = new car();
        v.maxspeed = 200; 
        v.setcolour("ZedBlack");
        System.out.println("Car vehicle is motorized = "+v.ismotorized());
        v.print();
        
        System.out.println();

        car c = new car();
        bicycle b = new bicycle();
        System.out.println("Car is motorized vehicle = "+c.ismotorized() + "\nBicycle is motorized vehicle = " + b.ismotorized());
        
        
    }
}