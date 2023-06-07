package J_4_Arrays;

import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int previous = s.nextInt();
        int a = 0;
        int i =2;
        boolean isDec = true;
        boolean sequence = true;
        
        while(i<=n)
        {
            int current = s.nextInt();
            if(current == previous)
            {
                sequence = false;
                break;
            }
            else if(previous > current)
            {
                if(isDec)
                {
                    previous = current;
                }
                else if(a == 1)
                {
                    sequence = false;
                    break;
                }
            }
            else if(current > previous)
            {
                isDec = false;
                a = 1;
                previous = current;
            }
            i++;
        }
        System.out.println(sequence);
        s.close();
    }
}
