package J_6_String;

public class J02 {
    public static void main(String[] args) {
        String str1 = "Coding";
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1, 5));

        System.out.println(str1.contains("ing"));

        String a = "coding";
        for (int i = 2; i < 4; i++) 
        {
            System.out.print(a.substring(i));
        }
        System.out.println();
        String b = "coding";
        for (int i = 2; i < 5; i++) 
        {
            System.out.print(b.substring(i - 2, i + 1));
        }
    }
}