// Program to understad the system of function overloading..

package J_3_Functions;

public class J06 {
    public static int sum(int n1){
        return ++n1;
    }
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static double sum(double n1, double n2){
        return n1 + n2;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(sum(a));
        System.out.println(sum(a,b));
        System.out.println(sum(5.6,9.45));
    }
}
