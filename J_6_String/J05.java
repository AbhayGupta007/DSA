// Two methods to initialise strings.

package J_6_String;

public class J05 
{
    public static void main(String[] args)
    {
        String str1 = "Abhay";                                               // String pool method.
        String str2 = new String("Gupta");                         // Heap and stack method.

        System.out.println(str1+" "+str2);


        String str3 = "abc";
        String str4 = new String("abc");
        String str5 = "abc";

        System.out.println(str3 == str5);                                   //String reference is compared. 
        System.out.println(str3 == str4);                                   //String reference is compared.
        System.out.println(str3.equals(str4));                              //String content is compared.
        
    }
}