package J_10_Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int n, char s, char h, char d)
    {
        if(n == 1)
        {
            System.out.println("move 1 disk from " + s + " to "+ d);
            return;
        }
        toh(n-1, s, d, h);
        System.out.println("move " + n + " disk from "+ s +" to "+ d);
        toh(n-1, h, s, d);
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        toh(n, 'a','b','c');
        s.close();
    }
}