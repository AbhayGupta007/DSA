package J_7_OOPS.Generics.Pair;

public class pair2use 
{
    public static void main(String[] args) 
    {
        pair2 <Integer, String> a = new pair2 <>(1, "Abhay Gupta");
        System.out.println(a.getfirst()+". "+ a.getsecond());

        pair2 <Integer, String> b = new pair2 <>(2, "Aditya Jha");
        System.out.println(b.getfirst()+". "+ b.getsecond());

        pair2 <Integer, String> c = new pair2 <>(3, "Aman Kumar");
        System.out.println(c.getfirst()+". "+ c.getsecond());
        
        pair2 <Integer, String> d = new pair2 <>(4, "Abhishek Srivastav");
        System.out.println(d.getfirst()+". "+ d.getsecond());

        pair2 <pair2<Integer, String>, String> e = new pair2 <pair2<Integer, String>, String>(a, "CSE");
        System.out.println("\n"+e.getfirst());
        System.out.println(e.getfirst().getfirst() + ". " + e.getfirst().getsecond() + " " + e.getsecond());

    }
}