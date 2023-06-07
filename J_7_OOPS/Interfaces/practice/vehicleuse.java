package J_7_OOPS.Interfaces.practice;

public class vehicleuse {
    public static void main(String[] args) {
        car c1 = new car();
        c1.setcompany("BMW");
        c1.color = "ZedBlack";
        c1.maxspeed = 200;
        c1.numdoors = 4;
        c1.setnumgears(5);
        c1.printcar();
        System.out.print(" It has "+ c1.getnumgears()+ " gears.");

        System.out.println();

        car c2 = new car(2, "Red", "Audi", 300);
        c2.setnumgears(6);
        c2.printcar();
        System.out.print(" It has "+ c2.getnumgears()+ " gears.");
    }
}