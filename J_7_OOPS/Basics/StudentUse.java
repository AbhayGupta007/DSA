package J_7_OOPS.Basics;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("s1= "+s1 + "\ns2= " + s2);
        s1.name = "Abhay Gupta";
        s1.setrollno(01);
        System.out.println(s1.name + " " + s1.getrollno());
        s2.name = "Aakriti";
        System.out.println(s2.name + " ");
    }
}