package J_6_String;

public class J01 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        String str = "AbhayGupta";
        char c = str.charAt(5);

        System.out.println(arr.length);
        System.out.println(str.length());
        System.out.println(c);

        
        String str1 = "Coding ";
        String str2 = "is fun.";
        // str1 = str1.concat(str2);
        // str1 += str2;
        System.out.println(str1 + str2);


        String a = "abcd";
        String b = "abcda";
        System.out.println(a.compareTo(b));


        String a1 = "coding", b1 = "ninjas";
        if (a1.contains("ing")) {
            a1 += b1;
        } else {
            b1 += "ing";
        }
        System.out.print(b1 + a1);
    }
}