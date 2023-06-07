package J_8_OOPS1;

import J_7_OOPS.Basics.Student1;

public class Studentusee {
    public static void main(String[] args) {
        Student1 s1 =  new Student1("Aakriti");
        System.out.println("name= "+s1.name+" rollno.= "+s1.rollno);
        s1.print();
    }
}