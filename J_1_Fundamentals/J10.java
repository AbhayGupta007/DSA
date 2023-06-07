// Program to print 3N+2 series and num should not be divisible by 4

package J_1_Fundamentals;
import java.util.Scanner;
public class J10 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int count = 1;
        if(x>=0 && x<=1000)
        {
            for(int i =1; count <=x; i++ )
            {
				int n = (3*i) + 2;
                if(n % 4 ==0)
                {
                    continue;
                }
                else
                {
                    System.out.print(n+ " ");
                    count++;
                }
            }
        }
        s.close();
    }
}