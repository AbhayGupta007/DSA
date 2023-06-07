//  Program to print N number of rows for Half Diamond pattern using stars and numbers.
// Second Method

package J_2_Pattern;
import java.util.Scanner;

public class J11 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=0 && n <=50)
        {
            System.out.print("*\n");
            for(int i=1; i<=n; i++)
            {
                System.out.print("*");
                int a =1;
                for(int j =1; j <= (2*i)-1; j++)
                {
                    if(j<=i)
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(i-a);
                        a = a+1;
                    }
                }
                System.out.print("*\n");
            }
            for(int i =n-1; i>=1; i--)
            {
                System.out.print("*");
                int a = 1;
                for(int j =1; j<=(2*i)-1; j++)
                {
                    if(j<=i)
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(i-a);
                        a++;
                    }
                }
                System.out.print("*\n");
            }
        }
        s.close();
    }
}