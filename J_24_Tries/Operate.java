package J_24_Tries;

public class Operate {
    public static void main(String[] args) {
        Tries t = new Tries();
        //Enter string with all capital letters only.
        t.add("ABHAY");
        t.add("GUPTA");
        System.out.println(t.search("ABHAY"));
    }
}
