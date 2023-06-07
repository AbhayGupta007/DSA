package J_7_OOPS.Generics.Pair;

public class pairuse 
{
    public static void main(String[] args) 
    {
        int i = 10;
        Integer i1 = null;
        System.out.println(i + " " + i1);

        Pair <Integer> pi = new Pair <Integer> (10, 20);
        System.out.println(pi.getfirst()+ " "+ pi.getsecond());

        Pair <String> ps = new Pair <String> ("Abhay", "Gupta");
        System.out.println(ps.getfirst()+" "+ ps.getsecond());

        Pair <String> s = new Pair <String> ();
        System.out.println(s.getfirst() + " "+ s.getsecond());
    }
}