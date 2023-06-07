package J_7_OOPS.Basics;

public class Studentuse1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Abhay");
        System.out.println("name= "+s1.name+" rollno.= "+s1.rollno);
        s1.print();


        Student1 s2 = new Student1("Akash");
        System.out.println("s2.name = "+s2.name+" s2.rollno.= "+s2.rollno);
        s2.print();


        // System.out.println("\n"+s1.getnumstd());
        System.out.println(Student1.getnumstd());
    }
}
