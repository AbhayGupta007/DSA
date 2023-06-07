/*
    %15s add 15 blank spaces to the left from the ending of the string. 
    %-15s add 15 blank spaces to the right from the starting of the string.
    
    %03d creates a integer of three digit and fill '0' to the left of the number from the ending of the number to third place.
    for eg if number given is 15 then it will print 015. 
           if number given is 7 then it will print 007.
           if number given is 897 then it will print 897.
           if the number given is greater than or equal to three digit number then the number will be printed as it is.
*/
package J_6_String;

import java.util.Scanner;

public class J16 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) 
        {
            String s1 = s.next();
            int x = s.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        s.close();
    }
}