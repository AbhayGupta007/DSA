//Program to Print complex alphabet pattern

package J_2_Pattern;
import java.util.Scanner;
public class J03 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=0 && n<=26)
        {
        	for(int i = 1; i<= n; i++)
            {
                int k=n-i+65;
                for(int j =1; j <= i; j++)
                {
                    System.out.print((char)(k));
                    k++;
                }
                System.out.println();
            }
        }
		s.close();
    }
}