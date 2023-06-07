package J_7_OOPS.Interfaces.intro;

public class vehicleuse {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        vehicle_interface v1 = new vehicle();
        v1.getcompany("Narcotics");
        // v1.printvehicle();

        v.getcompany("BMW");
        System.out.println(v.company);
        v.printvehicle(); 
    }
}