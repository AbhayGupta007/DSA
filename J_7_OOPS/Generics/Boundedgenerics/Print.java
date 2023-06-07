package J_7_OOPS.Generics.Boundedgenerics;

public class Print {
    public static <T extends printinterface> void printarr(T arr[]){
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
            arr[i].print();
        }
    }
    public static void main(String[] args) {
        System.out.println();

        vehicle v[] = new vehicle[5];
        for(int i = 0; i < v.length; i++)
        {
            v[i] = new vehicle(10*i, "Tesla");
        }
        printarr(v);
        System.out.println();

        Student s[] = new Student[5];
        for(int i = 0; i < s.length; i++)
        {
            s[i] = new Student(i);
        }
        printarr(s);
    }
}