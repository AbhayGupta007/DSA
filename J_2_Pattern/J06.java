//Program to print inverted number pattern.

package J_2_Pattern;

import java.util.Scanner;

public class J06 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=0 && n<=50)
        {
            for(int i = n; i>=1;i--)
        	{
            	int k = 1;
            	for(int j = 1; j<=n; j++)
            	{
                	if(i>j)
                	{
                	    System.out.print(" ");
                	}
                	else
                	{
                	    System.out.print(k);
                        k++;
                    }
            	}
            	System.out.println();
        	}
        }
        s.close();
    }   
}
